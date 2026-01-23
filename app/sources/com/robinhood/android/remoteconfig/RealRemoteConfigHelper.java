package com.robinhood.android.remoteconfig;

import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.ktx.RemoteConfig3;
import com.robinhood.Logger;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.remoteconfig.RemoteConfigHelper;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* compiled from: RealRemoteConfigHelper.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/remoteconfig/RealRemoteConfigHelper;", "Lcom/robinhood/utils/remoteconfig/RemoteConfigHelper;", "context", "Landroid/content/Context;", "remoteConfigStalePref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Landroid/content/Context;Lcom/robinhood/prefs/BooleanPreference;)V", "getContext", "()Landroid/content/Context;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "noJsonCrashLock", "Ljava/lang/Object;", "noJsonCrashUrlRegexListValue", "", "noJsonCrashUrlRegexListCacheValid", "", "noJsonCrashUrlRegexListCache", "", "Lkotlin/text/Regex;", "refreshConfig", "", "getNoJsonCrashUrlRegexList", "Companion", "lib-remoteconfig_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RealRemoteConfigHelper implements RemoteConfigHelper {
    public static final String KEY_NO_JSON_CRASH_URL_REGEX_LIST = "no_json_crash_url_regex_list";
    public static final long MIN_FETCH_INTERVAL_IN_SECONDS = 43200;
    private final Context context;
    private final Object noJsonCrashLock;
    private List<Regex> noJsonCrashUrlRegexListCache;
    private boolean noJsonCrashUrlRegexListCacheValid;
    private String noJsonCrashUrlRegexListValue;
    private final FirebaseRemoteConfig remoteConfig;
    private final BooleanPreference remoteConfigStalePref;

    public RealRemoteConfigHelper(Context context, BooleanPreference remoteConfigStalePref) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteConfigStalePref, "remoteConfigStalePref");
        this.context = context;
        this.remoteConfigStalePref = remoteConfigStalePref;
        FirebaseRemoteConfig remoteConfig = RemoteConfig3.getRemoteConfig(Firebase.INSTANCE);
        this.remoteConfig = remoteConfig;
        this.noJsonCrashLock = new Object();
        this.noJsonCrashUrlRegexListValue = "";
        this.noJsonCrashUrlRegexListCache = CollectionsKt.emptyList();
        remoteConfig.setConfigSettingsAsync(RemoteConfig3.remoteConfigSettings(new Function1() { // from class: com.robinhood.android.remoteconfig.RealRemoteConfigHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RealRemoteConfigHelper._init_$lambda$0((FirebaseRemoteConfigSettings.Builder) obj);
            }
        }));
        refreshConfig();
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(FirebaseRemoteConfigSettings.Builder remoteConfigSettings) {
        Intrinsics.checkNotNullParameter(remoteConfigSettings, "$this$remoteConfigSettings");
        remoteConfigSettings.setMinimumFetchIntervalInSeconds(MIN_FETCH_INTERVAL_IN_SECONDS);
        return Unit.INSTANCE;
    }

    private final void refreshConfig() {
        long j;
        Logger.Companion companion = Logger.INSTANCE;
        companion.mo1679d("Start fetching remote config.", new Object[0]);
        if (this.remoteConfigStalePref.get()) {
            companion.mo1679d("Existing remote config is stale, fetch immediately.", new Object[0]);
            j = 0;
        } else {
            j = MIN_FETCH_INTERVAL_IN_SECONDS;
        }
        this.remoteConfig.fetch(j).addOnCompleteListener(new OnCompleteListener() { // from class: com.robinhood.android.remoteconfig.RealRemoteConfigHelper.refreshConfig.1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> task) {
                Intrinsics.checkNotNullParameter(task, "task");
                RealRemoteConfigHelper.this.remoteConfigStalePref.delete();
                if (task.isSuccessful()) {
                    RealRemoteConfigHelper.this.remoteConfig.activate();
                    Logger.INSTANCE.mo1679d("Successfully loaded remote config.", new Object[0]);
                    String string2 = RealRemoteConfigHelper.this.remoteConfig.getString(RealRemoteConfigHelper.KEY_NO_JSON_CRASH_URL_REGEX_LIST);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Object obj = RealRemoteConfigHelper.this.noJsonCrashLock;
                    RealRemoteConfigHelper realRemoteConfigHelper = RealRemoteConfigHelper.this;
                    synchronized (obj) {
                        try {
                            if (!Intrinsics.areEqual(string2, realRemoteConfigHelper.noJsonCrashUrlRegexListValue)) {
                                realRemoteConfigHelper.noJsonCrashUrlRegexListValue = string2;
                                realRemoteConfigHelper.noJsonCrashUrlRegexListCacheValid = false;
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                Logger.INSTANCE.mo1681e("Failed to load remote config.", new Object[0]);
            }
        });
    }

    @Override // com.robinhood.utils.remoteconfig.RemoteConfigHelper
    public List<Regex> getNoJsonCrashUrlRegexList() {
        List<String> list;
        List<Regex> listEmptyList;
        Regex regex;
        synchronized (this.noJsonCrashLock) {
            if (this.noJsonCrashUrlRegexListCacheValid) {
                return this.noJsonCrashUrlRegexListCache;
            }
            if (this.noJsonCrashUrlRegexListValue.length() == 0) {
                this.noJsonCrashUrlRegexListCache = CollectionsKt.emptyList();
            } else {
                ParameterizedType parameterizedTypeNewParameterizedType = Types.newParameterizedType(List.class, String.class);
                Moshi moshiBuild = new Moshi.Builder().build();
                Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
                JsonAdapter jsonAdapterAdapter = moshiBuild.adapter(parameterizedTypeNewParameterizedType);
                Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
                try {
                    list = (List) jsonAdapterAdapter.fromJson(this.noJsonCrashUrlRegexListValue);
                } catch (JsonDataException e) {
                    Logger.INSTANCE.mo1682e(e, "Got invalid json format for url regex list: %s", this.noJsonCrashUrlRegexListValue);
                    list = null;
                }
                if (list == null) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = new ArrayList<>();
                    for (String str : list) {
                        try {
                            regex = new Regex(str);
                        } catch (Exception e2) {
                            Logger.INSTANCE.mo1682e(e2, "Got invalid regex format for url regex: %s", str);
                            regex = null;
                        }
                        if (regex != null) {
                            listEmptyList.add(regex);
                        }
                    }
                }
                this.noJsonCrashUrlRegexListCache = listEmptyList;
            }
            this.noJsonCrashUrlRegexListCacheValid = true;
            return this.noJsonCrashUrlRegexListCache;
        }
    }
}
