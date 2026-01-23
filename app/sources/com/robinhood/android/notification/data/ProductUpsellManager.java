package com.robinhood.android.notification.data;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationManagerCompat;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.experiments.ExperimentExposureLogger;
import com.robinhood.analytics.experiments.ExperimentExposureLogger2;
import com.robinhood.android.notification.data.ProductUpsellExperiments;
import com.robinhood.android.productupsell.contracts.ProductUpsellKey;
import com.robinhood.coroutines.dagger.annotation.IODispatcher;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Observable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: ProductUpsellManager.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001bH\u0087@¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b\u001f\u0010\u0019J\u001d\u0010\"\u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$H\u0097@¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020$¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020$H\u0096@¢\u0006\u0004\b*\u0010\u0019J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020$¢\u0006\u0004\b.\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0017088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellManager;", "", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Landroid/content/SharedPreferences;", SharedPreferencesModule.USER_PREFS_NAME, "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Landroid/content/Context;", "context", "Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "upsellKey", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "experimentExposureLogger", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;Landroid/content/SharedPreferences;Lkotlinx/coroutines/CoroutineDispatcher;Landroid/content/Context;Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;Lj$/time/Clock;)V", "", "now", "()J", "Lcom/robinhood/android/notification/data/ProductUpsellSettings;", "getSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settings", "", "saveSettings", "(Lcom/robinhood/android/notification/data/ProductUpsellSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSettings", "markUpsellSeen", "Lcom/robinhood/experiments/Experiment;", "experiment", "logExposure", "(Lcom/robinhood/experiments/Experiment;)V", "", "defaultEnrolled", "isEnrolledInExperiment", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notificationsEnabled", "()Z", "isUpsellAllowed", "j$/time/Duration", "durationBetweenPromptsSeen", "(Lcom/robinhood/android/notification/data/ProductUpsellSettings;)Lj$/time/Duration;", "passesAdditionalCriteria", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroid/content/Context;", "Lcom/robinhood/android/productupsell/contracts/ProductUpsellKey;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "Lj$/time/Clock;", "Lcom/robinhood/prefs/StringPreference;", "pref", "Lcom/robinhood/prefs/StringPreference;", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "currentExperiment", "Lcom/robinhood/experiments/Experiment;", "Landroidx/core/app/NotificationManagerCompat;", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "feature-lib-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public class ProductUpsellManager {
    private final JsonAdapter<ProductUpsellSettings> adapter;
    private final Clock clock;
    private final Context context;
    private final Experiment<?> currentExperiment;
    private final ExperimentExposureLogger experimentExposureLogger;
    private final ExperimentsStore experimentsStore;
    private final CoroutineDispatcher ioDispatcher;
    private final NotificationManagerCompat notificationManager;
    private final StringPreference pref;
    private final ProductUpsellKey upsellKey;

    /* compiled from: ProductUpsellManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.notification.data.ProductUpsellManager", m3645f = "ProductUpsellManager.kt", m3646l = {49}, m3647m = "getSettings")
    /* renamed from: com.robinhood.android.notification.data.ProductUpsellManager$getSettings$1 */
    static final class C226041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C226041(Continuation<? super C226041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductUpsellManager.this.getSettings(this);
        }
    }

    /* compiled from: ProductUpsellManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.notification.data.ProductUpsellManager", m3645f = "ProductUpsellManager.kt", m3646l = {144}, m3647m = "isEnrolledInExperiment$suspendImpl")
    /* renamed from: com.robinhood.android.notification.data.ProductUpsellManager$isEnrolledInExperiment$1 */
    static final class C226051 extends ContinuationImpl {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C226051(Continuation<? super C226051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductUpsellManager.isEnrolledInExperiment$suspendImpl(ProductUpsellManager.this, false, this);
        }
    }

    public Object isEnrolledInExperiment(boolean z, Continuation<? super Boolean> continuation) {
        return isEnrolledInExperiment$suspendImpl(this, z, continuation);
    }

    public Object isUpsellAllowed(Continuation<? super Boolean> continuation) {
        return isUpsellAllowed$suspendImpl(this, continuation);
    }

    public ProductUpsellManager(LazyMoshi moshi, @UserPrefs SharedPreferences userPrefs, @IODispatcher CoroutineDispatcher ioDispatcher, Context context, ProductUpsellKey upsellKey, ExperimentsStore experimentsStore, ExperimentExposureLogger experimentExposureLogger, Clock clock) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(upsellKey, "upsellKey");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.ioDispatcher = ioDispatcher;
        this.context = context;
        this.upsellKey = upsellKey;
        this.experimentsStore = experimentsStore;
        this.experimentExposureLogger = experimentExposureLogger;
        this.clock = clock;
        this.pref = new StringPreference(userPrefs, upsellKey.getStorageKey(), null, null, 12, null);
        this.adapter = moshi.adapter(ProductUpsellSettings.class);
        this.currentExperiment = ProductUpsellHelper.getExperiment(upsellKey);
        this.notificationManager = ContextSystemServices.getNotificationManager(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSettings(Continuation<? super ProductUpsellSettings> continuation) throws IOException {
        C226041 c226041;
        if (continuation instanceof C226041) {
            c226041 = (C226041) continuation;
            int i = c226041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c226041.label = i - Integer.MIN_VALUE;
            } else {
                c226041 = new C226041(continuation);
            }
        }
        Object objCoGet = c226041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c226041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCoGet);
            StringPreference stringPreference = this.pref;
            c226041.label = 1;
            objCoGet = stringPreference.coGet(c226041);
            if (objCoGet == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCoGet);
        }
        String str = (String) objCoGet;
        if (str == null || StringsKt.isBlank(str)) {
            return new ProductUpsellSettings(0L, 0, 0L, 7, null);
        }
        ProductUpsellSettings productUpsellSettingsFromJson = this.adapter.fromJson(str);
        return productUpsellSettingsFromJson == null ? new ProductUpsellSettings(0L, 0, 0L, 7, null) : productUpsellSettingsFromJson;
    }

    public final Object saveSettings(ProductUpsellSettings productUpsellSettings, Continuation<? super Unit> continuation) {
        LibProductUpsellLoggable.debugLog("saveSettings: " + productUpsellSettings);
        Object objCoSet = this.pref.coSet(this.adapter.toJson(productUpsellSettings), continuation);
        return objCoSet == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoSet : Unit.INSTANCE;
    }

    public final Object clearSettings(Continuation<? super Unit> continuation) {
        Object objCoDelete = this.pref.coDelete(continuation);
        return objCoDelete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoDelete : Unit.INSTANCE;
    }

    /* compiled from: ProductUpsellManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.notification.data.ProductUpsellManager$markUpsellSeen$2", m3645f = "ProductUpsellManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.notification.data.ProductUpsellManager$markUpsellSeen$2 */
    static final class C226072 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C226072(Continuation<? super C226072> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductUpsellManager.this.new C226072(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C226072) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r1.saveSettings(r7, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProductUpsellManager productUpsellManager = ProductUpsellManager.this;
                productUpsellManager.logExposure(productUpsellManager.currentExperiment);
                ProductUpsellManager productUpsellManager2 = ProductUpsellManager.this;
                this.label = 1;
                obj = productUpsellManager2.getSettings(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ProductUpsellManager productUpsellManager3 = ProductUpsellManager.this;
            ProductUpsellSettings productUpsellSettings = (ProductUpsellSettings) obj;
            productUpsellSettings.setLastSeenAt(productUpsellManager3.now());
            productUpsellSettings.setSeenCount(productUpsellSettings.getSeenCount() + 1);
            this.label = 2;
        }
    }

    public final Object markUpsellSeen(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.ioDispatcher, new C226072(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long now() {
        return Instant.now(this.clock).toEpochMilli();
    }

    public void logExposure(Experiment<?> experiment) {
        Experiment<?> experiment2 = this.currentExperiment;
        if (experiment2 != null) {
            ExperimentExposureLogger2.logExposure(this.experimentExposureLogger, experiment2, KaizenExperiment.VARIATION_MEMBER);
        }
    }

    public static /* synthetic */ Object isEnrolledInExperiment$default(ProductUpsellManager productUpsellManager, boolean z, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isEnrolledInExperiment");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return productUpsellManager.isEnrolledInExperiment(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object isEnrolledInExperiment$suspendImpl(ProductUpsellManager productUpsellManager, boolean z, Continuation<? super Boolean> continuation) {
        C226051 c226051;
        if (continuation instanceof C226051) {
            c226051 = (C226051) continuation;
            int i = c226051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c226051.label = i - Integer.MIN_VALUE;
            } else {
                c226051 = productUpsellManager.new C226051(continuation);
            }
        }
        Object objAwaitFirst = c226051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c226051.label;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Experiment<?> experiment = productUpsellManager.currentExperiment;
            if (experiment != null) {
                Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(productUpsellManager.experimentsStore, new Experiment[]{experiment}, false, null, 6, null);
                c226051.Z$0 = z;
                c226051.label = 1;
                objAwaitFirst = RxAwait3.awaitFirst(observableStreamState$default, c226051);
                if (objAwaitFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!z) {
                zBooleanValue = false;
            }
            return boxing.boxBoolean(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = c226051.Z$0;
        ResultKt.throwOnFailure(objAwaitFirst);
        Boolean bool = (Boolean) objAwaitFirst;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (!z) {
        }
        return boxing.boxBoolean(zBooleanValue);
    }

    public final boolean notificationsEnabled() {
        return this.notificationManager.areNotificationsEnabled();
    }

    /* compiled from: ProductUpsellManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.notification.data.ProductUpsellManager$isUpsellAllowed$2", m3645f = "ProductUpsellManager.kt", m3646l = {100, 102}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.notification.data.ProductUpsellManager$isUpsellAllowed$2 */
    static final class C226062 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        boolean Z$0;
        boolean Z$1;
        int label;

        C226062(Continuation<? super C226062> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductUpsellManager.this.new C226062(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C226062) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException {
            boolean zBooleanValue;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z2 = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProductUpsellManager productUpsellManager = ProductUpsellManager.this;
                this.label = 1;
                obj = ProductUpsellManager.isEnrolledInExperiment$default(productUpsellManager, false, this, 1, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$1;
                zBooleanValue = this.Z$0;
                ResultKt.throwOnFailure(obj);
                ProductUpsellSettings productUpsellSettings = (ProductUpsellSettings) obj;
                Duration durationDurationBetweenPromptsSeen = ProductUpsellManager.this.durationBetweenPromptsSeen(productUpsellSettings);
                long jM28755plusLRDsOJo = kotlin.time.Duration.m28755plusLRDsOJo(Duration3.toDuration(durationDurationBetweenPromptsSeen.getSeconds(), DurationUnitJvm.SECONDS), Duration3.toDuration(durationDurationBetweenPromptsSeen.getNano(), DurationUnitJvm.NANOSECONDS));
                boolean z3 = productUpsellSettings.getSeenCount() >= 3;
                boolean z4 = kotlin.time.Duration.m28738getInWholeMillisecondsimpl(jM28755plusLRDsOJo) <= productUpsellSettings.getAllowedIntervalBetweenPrompts();
                LibProductUpsellLoggable.debugLog("experimentAllowed=" + zBooleanValue + ", passesAdditionalCriteria=" + z + ", pastMinIntervalRequired=" + z4 + ", seenCount=" + productUpsellSettings.getSeenCount() + ", intervalBetweenPrompts=" + ProductUpsellManager.this.durationBetweenPromptsSeen(productUpsellSettings));
                if (zBooleanValue && z && z4 && z3) {
                    z2 = true;
                }
                return boxing.boxBoolean(z2);
            }
            ResultKt.throwOnFailure(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            boolean zPassesAdditionalCriteria = ProductUpsellManager.this.passesAdditionalCriteria();
            ProductUpsellManager productUpsellManager2 = ProductUpsellManager.this;
            this.Z$0 = zBooleanValue;
            this.Z$1 = zPassesAdditionalCriteria;
            this.label = 2;
            Object settings = productUpsellManager2.getSettings(this);
            if (settings != coroutine_suspended) {
                z = zPassesAdditionalCriteria;
                obj = settings;
                ProductUpsellSettings productUpsellSettings2 = (ProductUpsellSettings) obj;
                Duration durationDurationBetweenPromptsSeen2 = ProductUpsellManager.this.durationBetweenPromptsSeen(productUpsellSettings2);
                long jM28755plusLRDsOJo2 = kotlin.time.Duration.m28755plusLRDsOJo(Duration3.toDuration(durationDurationBetweenPromptsSeen2.getSeconds(), DurationUnitJvm.SECONDS), Duration3.toDuration(durationDurationBetweenPromptsSeen2.getNano(), DurationUnitJvm.NANOSECONDS));
                if (productUpsellSettings2.getSeenCount() >= 3) {
                }
                if (kotlin.time.Duration.m28738getInWholeMillisecondsimpl(jM28755plusLRDsOJo2) <= productUpsellSettings2.getAllowedIntervalBetweenPrompts()) {
                }
                LibProductUpsellLoggable.debugLog("experimentAllowed=" + zBooleanValue + ", passesAdditionalCriteria=" + z + ", pastMinIntervalRequired=" + z4 + ", seenCount=" + productUpsellSettings2.getSeenCount() + ", intervalBetweenPrompts=" + ProductUpsellManager.this.durationBetweenPromptsSeen(productUpsellSettings2));
                if (zBooleanValue) {
                    z2 = true;
                }
                return boxing.boxBoolean(z2);
            }
            return coroutine_suspended;
        }
    }

    static /* synthetic */ Object isUpsellAllowed$suspendImpl(ProductUpsellManager productUpsellManager, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(productUpsellManager.ioDispatcher, productUpsellManager.new C226062(null), continuation);
    }

    public final Duration durationBetweenPromptsSeen(ProductUpsellSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Duration durationBetween = Duration.between(Instant.ofEpochMilli(settings.getLastSeenAt()), Instant.now(this.clock));
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        return durationBetween;
    }

    public final boolean passesAdditionalCriteria() {
        return ((ProductUpsellHelper.getExperiment(this.upsellKey) instanceof ProductUpsellExperiments.PostTradeNotificationExperiment) && this.notificationManager.areNotificationsEnabled()) ? false : true;
    }
}
