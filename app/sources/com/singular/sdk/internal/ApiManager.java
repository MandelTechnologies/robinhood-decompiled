package com.singular.sdk.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ApiManager {
    private static final SingularLog logger = SingularLog.getLogger(ApiManager.class.getSimpleName());
    final Context context;
    private Queue queue;
    final Runnable runnable = new Runnable() { // from class: com.singular.sdk.internal.ApiManager.2
        @Override // java.lang.Runnable
        public void run() {
            if (!SingularInstance.getInstance().isInitialized()) {
                ApiManager.logger.debug("Singular is not initialized!");
                return;
            }
            if (!Utils.isConnected(ApiManager.this.context)) {
                ApiManager.logger.debug("Oops, not connected to internet!");
                return;
            }
            try {
                String strPeek = ApiManager.this.queue.peek();
                if (strPeek == null) {
                    ApiManager.logger.debug("Queue is empty");
                    return;
                }
                BaseApi baseApiFrom = BaseApi.from(strPeek);
                ApiManager.logger.debug("api = %s", baseApiFrom.getClass().getName());
                if (baseApiFrom.makeRequest(SingularInstance.getInstance())) {
                    Utils.resetRetryCountForKey(ApiManager.this.context, Long.toString(baseApiFrom.getTimestamp()));
                    ApiManager.this.queue.remove();
                    ApiManager.this.wakeUp();
                }
            } catch (Throwable th) {
                ApiManager.logger.error("IOException in processing an event: %s", th.getMessage());
            }
        }
    };
    private SingularWorkerThread worker;

    public ApiManager(SingularWorkerThread singularWorkerThread, Context context, Queue queue) {
        this.context = context;
        this.queue = queue;
        if (queue == null) {
            return;
        }
        logger.debug("Queue: %s", queue.getClass().getSimpleName());
        if (singularWorkerThread == null) {
            return;
        }
        this.worker = singularWorkerThread;
        singularWorkerThread.start();
    }

    void wakeUp() {
        SingularWorkerThread singularWorkerThread = this.worker;
        if (singularWorkerThread == null) {
            return;
        }
        singularWorkerThread.getHandler().removeCallbacksAndMessages(null);
        this.worker.post(this.runnable);
    }

    void enqueue(BaseApi baseApi) {
        if (baseApi != null) {
            try {
                if (this.queue == null) {
                    return;
                }
                if (!(baseApi instanceof ApiGDPRConsent) && !(baseApi instanceof ApiGDPRUnder13)) {
                    baseApi.put(Constants.EVENT_INDEX, String.valueOf(Utils.getEventIndex(this.context)));
                }
                baseApi.put(Constants.SINGULAR_INSTALL_ID, Utils.getSingularId(this.context).toString());
                enrichRequestFromSingularInstance(baseApi);
                this.queue.add(baseApi.toJsonAsString());
                wakeUp();
            } catch (IndexOutOfBoundsException unused) {
            } catch (Throwable th) {
                logger.error("error in enqueue()", th);
            }
        }
    }

    private void enrichRequestFromSingularInstance(BaseApi baseApi) {
        SingularInstance singularInstance = SingularInstance.getInstance();
        JSONObject globalPropertiesJSON = singularInstance.getGlobalPropertiesJSON();
        if (globalPropertiesJSON.length() != 0) {
            baseApi.put(Constants.GLOBAL_PROPERTIES_KEY, globalPropertiesJSON.toString());
        }
        Boolean limitDataSharing = singularInstance.getLimitDataSharing();
        if (limitDataSharing != null) {
            baseApi.put(Constants.DATA_SHARING_OPTIONS, new JSONObject((Map<?, ?>) new HashMap(limitDataSharing) { // from class: com.singular.sdk.internal.ApiManager.1
                final /* synthetic */ Boolean val$limitDataSharing;

                {
                    this.val$limitDataSharing = limitDataSharing;
                    limitDataSharing.booleanValue();
                    put("limit_data_sharing", limitDataSharing);
                }
            }).toString());
        }
    }
}
