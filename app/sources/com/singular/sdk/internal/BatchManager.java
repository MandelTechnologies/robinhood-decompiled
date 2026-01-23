package com.singular.sdk.internal;

import android.content.Context;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class BatchManager {
    private static final String SEND_ID = "send_id";
    private static BatchManager instance;
    private static final SingularLog logger = SingularLog.getLogger(BatchManager.class.getSimpleName());
    private BatchManagerPersistence batchManagerPersistence;
    private Context context;
    private NetworkSender networkSender;
    private RegularFlowSender regularFlowSender;
    private long sendId;
    private Semaphore sendIdMutex = new Semaphore(1, true);
    private Semaphore sendMutex = new Semaphore(1, true);
    private String[] batchFields = {Constants.ADMON_AD_PLATFORM, Constants.ADMON_CURRENCY, Constants.REVENUE_CURRENCY_KEY};
    private Map<String, BaseApi> eventsDataStructure = new ConcurrentHashMap();

    public interface NetworkSender {
        boolean sendApi(BaseApi baseApi);
    }

    public interface RegularFlowSender {
        void sendApi(BaseApi baseApi);
    }

    private String prepareKey(BaseApi baseApi) throws JSONException {
        logger.debug("prepareKey for API: " + baseApi.toJsonAsString());
        JSONObject jSONObject = new JSONObject(baseApi.get(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(SEND_ID, this.sendId);
        for (String str : this.batchFields) {
            try {
                jSONObject2.put(str, jSONObject.getString(str));
            } catch (JSONException e) {
                logger.error(Utils.formatException(e));
            }
        }
        logger.debug("prepareKey result: " + jSONObject2.toString());
        return jSONObject2.toString();
    }

    public static BatchManager getInstance() {
        if (instance == null) {
            instance = new BatchManager();
        }
        return instance;
    }

    private BatchManager() {
    }

    public void setup(Context context) {
        this.batchManagerPersistence = new BatchManagerPersistenceSqlite(context);
        this.networkSender = new NetworkSender() { // from class: com.singular.sdk.internal.BatchManager.1
            @Override // com.singular.sdk.internal.BatchManager.NetworkSender
            public boolean sendApi(BaseApi baseApi) {
                try {
                    JSONObject globalPropertiesJSON = SingularInstance.getInstance().getGlobalPropertiesJSON();
                    if (globalPropertiesJSON.length() != 0) {
                        baseApi.put(Constants.GLOBAL_PROPERTIES_KEY, globalPropertiesJSON.toString());
                    }
                    return baseApi.makeRequest(SingularInstance.getInstance());
                } catch (IOException e) {
                    BatchManager.logger.error(Utils.formatException(e));
                    return false;
                }
            }
        };
        this.regularFlowSender = new RegularFlowSender() { // from class: com.singular.sdk.internal.BatchManager.2
            @Override // com.singular.sdk.internal.BatchManager.RegularFlowSender
            public void sendApi(BaseApi baseApi) {
                SingularInstance.getInstance().getApiManager().enqueue(baseApi);
            }
        };
        this.sendId = this.batchManagerPersistence.getSendId();
        this.context = context;
        loadFromPersistence();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void batchEvent(BaseApi baseApi) throws JSONException, IOException {
        try {
            this.sendIdMutex.acquire();
        } catch (InterruptedException e) {
            logger.error(Utils.formatException(e));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String strPrepareKey = prepareKey(baseApi);
            SingularLog singularLog = logger;
            singularLog.debug("batchEvent: " + baseApi.toJsonAsString());
            singularLog.debug("batchEvent: key: " + strPrepareKey);
            JSONObject jSONObject = new JSONObject(baseApi.get(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY));
            if (this.eventsDataStructure.containsKey(strPrepareKey)) {
                BaseApi baseApi2 = this.eventsDataStructure.get(strPrepareKey);
                JSONObject jSONObject2 = new JSONObject(baseApi2.get(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY));
                double d = jSONObject2.getDouble(Constants.REVENUE_AMOUNT_KEY) + jSONObject.getDouble(Constants.REVENUE_AMOUNT_KEY);
                double d2 = jSONObject2.getDouble(Constants.ADMON_REVENUE) + jSONObject.getDouble(Constants.ADMON_REVENUE);
                int i = jSONObject2.getInt(Constants.ADMON_COUNT) + 1;
                jSONObject2.put(Constants.REVENUE_AMOUNT_KEY, d);
                jSONObject2.put(Constants.ADMON_REVENUE, d2);
                jSONObject2.put(Constants.ADMON_COUNT, i);
                jSONObject2.put(Constants.ADMON_LAST_UPDATE_TIMESTAMP, jCurrentTimeMillis);
                baseApi2.put(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, jSONObject2.toString());
                singularLog.debug("batchEvent: added to existing event: " + baseApi2.toJsonAsString());
                this.sendIdMutex.release();
                this.batchManagerPersistence.updateEvent(strPrepareKey, baseApi2.toJsonAsString());
            } else {
                JSONObject jSONObject3 = new JSONObject(strPrepareKey);
                jSONObject3.remove(SEND_ID);
                double d3 = jSONObject.getDouble(Constants.REVENUE_AMOUNT_KEY);
                double d4 = jSONObject.getDouble(Constants.ADMON_REVENUE);
                jSONObject3.put(Constants.REVENUE_AMOUNT_KEY, d3);
                jSONObject3.put(Constants.ADMON_REVENUE, d4);
                jSONObject3.put(Constants.ADMON_COUNT, 1);
                jSONObject3.put(Constants.ADMON_IS_ADMON_REVENUE, jSONObject.getBoolean(Constants.ADMON_IS_ADMON_REVENUE));
                jSONObject3.put(Constants.IS_REVENUE_EVENT_KEY, jSONObject.getBoolean(Constants.IS_REVENUE_EVENT_KEY));
                jSONObject3.put(Constants.ADMON_FIRST_UPDATE_TIMESTAMP, jCurrentTimeMillis);
                jSONObject3.put(Constants.ADMON_LAST_UPDATE_TIMESTAMP, jCurrentTimeMillis);
                baseApi.put(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, jSONObject3.toString());
                baseApi.put(Constants.EVENT_INDEX, Constants.RequestParamsKeys.DEVELOPER_API_KEY + String.valueOf(Utils.getAdmonEventIndex(this.context)));
                if (ConfigManager.getInstance().isAdmonEventsDebug()) {
                    baseApi.put(Constants.ADMON_EVENT_DEBUG_PARAM, "true");
                }
                this.eventsDataStructure.put(strPrepareKey, baseApi);
                this.sendIdMutex.release();
                this.batchManagerPersistence.addEvent(strPrepareKey, baseApi.toJsonAsString());
                singularLog.debug("batchEvent: created 1st event: " + baseApi.toJsonAsString());
            }
        } catch (Throwable th) {
            this.sendIdMutex.release();
            logger.error(Utils.formatException(th));
            throw th;
        }
    }

    private void loadFromPersistence() {
        logger.debug("loadFromPersistence");
        for (Map.Entry<String, String> entry : this.batchManagerPersistence.getAllEvents()) {
            try {
                this.eventsDataStructure.put(entry.getKey(), BaseApi.from(entry.getValue()));
            } catch (Throwable th) {
                logger.error(Utils.formatException(th));
            }
        }
        logger.debug("loadFromPersistence: loaded " + this.eventsDataStructure.size() + " entries");
    }

    public void addToBatch(final BaseApi baseApi) {
        final boolean zIsAggregateAdmonEvents = ConfigManager.getInstance().isAggregateAdmonEvents();
        final boolean zIsAdmonEventsDebug = ConfigManager.getInstance().isAdmonEventsDebug();
        if (zIsAggregateAdmonEvents && zIsAdmonEventsDebug && baseApi.isAdmonEvent()) {
            try {
                this.regularFlowSender.sendApi(BaseApi.from(baseApi.toJsonAsString()));
            } catch (IOException e) {
                logger.error("IOExceptionException", e);
            } catch (Throwable th) {
                logger.error("Throwable", th);
            }
        }
        try {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.singular.sdk.internal.BatchManager.3
                @Override // java.lang.Runnable
                public void run() {
                    BatchManager.logger.debug("addToBatch api: " + baseApi.toJsonAsString());
                    if (!zIsAggregateAdmonEvents || !baseApi.isAdmonEvent()) {
                        BatchManager.logger.debug("addToBatch: no need to batch: batching enabled: " + zIsAggregateAdmonEvents + " is Admon event: " + baseApi.isAdmonEvent());
                        BatchManager.this.regularFlowSender.sendApi(baseApi);
                        return;
                    }
                    BatchManager.logger.debug("addToBatch: event needs to be batched");
                    try {
                        BatchManager.this.batchEvent(baseApi);
                    } catch (Throwable th2) {
                        BatchManager.logger.debug("addToBatch: exception: " + th2.getMessage());
                        if (zIsAdmonEventsDebug) {
                            return;
                        }
                        BatchManager.this.regularFlowSender.sendApi(baseApi);
                    }
                }
            });
        } catch (Throwable th2) {
            logger.error(Utils.formatException(th2));
        }
    }

    public void sendEvents() {
        if (ConfigManager.getInstance().isAggregateAdmonEvents()) {
            try {
                Executors.newSingleThreadExecutor().execute(new RunnableC423604());
            } catch (Throwable th) {
                logger.error(Utils.formatException(th));
            }
        }
    }

    /* renamed from: com.singular.sdk.internal.BatchManager$4 */
    class RunnableC423604 implements Runnable {
        RunnableC423604() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC423604 runnableC423604;
            Semaphore semaphore;
            try {
                try {
                    BatchManager.this.sendMutex.acquire();
                    BatchManager.this.sendIdMutex.acquire();
                } catch (Throwable th) {
                    BatchManager.logger.error(Utils.formatException(th));
                }
                BatchManager batchManager = BatchManager.this;
                batchManager.sendId = batchManager.batchManagerPersistence.incSendId();
                BatchManager.this.sendIdMutex.release();
                BatchManager.logger.debug("sendEvents: total events to send " + BatchManager.this.eventsDataStructure.size());
                final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                String[] strArr = (String[]) BatchManager.this.eventsDataStructure.keySet().toArray(new String[0]);
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < strArr.length; i++) {
                    if (new JSONObject(strArr[i]).getLong(BatchManager.SEND_ID) < BatchManager.this.sendId) {
                        linkedList.add(strArr[i]);
                    }
                }
                String[] strArr2 = (String[]) linkedList.toArray(new String[0]);
                final Semaphore semaphore2 = new Semaphore(0, true);
                for (final String str : strArr2) {
                    final BaseApi baseApi = (BaseApi) BatchManager.this.eventsDataStructure.get(str);
                    BatchManager.logger.debug("sendEvents: sending event with key: " + str + " and body: " + baseApi.toString());
                    try {
                        runnableC423604 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        runnableC423604 = this;
                    }
                    try {
                        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.singular.sdk.internal.BatchManager.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (BatchManager.this.networkSender.sendApi(baseApi)) {
                                    BatchManager.logger.debug("sendEvents: sending event with key: " + str + " is successful");
                                    executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.singular.sdk.internal.BatchManager.4.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            try {
                                                BatchManager.this.eventsDataStructure.remove(str);
                                                BatchManager.this.batchManagerPersistence.deleteEvent(str);
                                            } finally {
                                                try {
                                                } finally {
                                                }
                                            }
                                        }
                                    });
                                    return;
                                }
                                BatchManager.logger.debug("sendEvents: sending event with key: " + str + " has failed");
                                semaphore2.release();
                            }
                        });
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            BatchManager.logger.error(Utils.formatException(th));
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                BatchManager.logger.error(Utils.formatException(th));
                            } finally {
                                BatchManager.this.sendIdMutex.release();
                            }
                        }
                    }
                }
                runnableC423604 = this;
                try {
                    semaphore2.tryAcquire(strArr2.length, 60L, TimeUnit.SECONDS);
                    semaphore = BatchManager.this.sendMutex;
                } catch (Throwable th5) {
                    try {
                        BatchManager.logger.error(Utils.formatException(th5));
                        semaphore = BatchManager.this.sendMutex;
                    } catch (Throwable th6) {
                        BatchManager.this.sendMutex.release();
                        throw th6;
                    }
                }
                semaphore.release();
            } catch (Throwable th7) {
                th = th7;
                runnableC423604 = this;
                BatchManager.logger.error(Utils.formatException(th));
            }
        }
    }
}
