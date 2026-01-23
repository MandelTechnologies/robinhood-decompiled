package com.robinhood.shared.i18n.store.locale;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.i18n.api.locale.LocaleBonfireApi;
import com.robinhood.shared.i18n.locale.SupportedLocaleRepository;
import com.robinhood.shared.i18n.models.locale.api.ApiRemoteSupportedLocale;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: SupportedLocaleStore.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012J\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/i18n/store/locale/SupportedLocaleStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "localeBonfireApi", "Lcom/robinhood/shared/i18n/api/locale/LocaleBonfireApi;", "remoteSupportedLocalePref", "Lcom/robinhood/prefs/StringPreference;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/i18n/api/locale/LocaleBonfireApi;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/shared/i18n/models/locale/api/ApiRemoteSupportedLocale;", "streamSupportedLocale", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/utils/Optional;", "Ljava/util/Locale;", "getSupportedLocale", "fallbackLocale", "(Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshSupportedLocale", "force", "", "toAndroidLanguageTag", "", "lib-store-locale_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class SupportedLocaleStore extends Store implements SupportedLocaleRepository {
    private final AppType appType;
    private final Endpoint<Unit, ApiRemoteSupportedLocale> endpoint;
    private final LocaleBonfireApi localeBonfireApi;
    private final StringPreference remoteSupportedLocalePref;

    /* compiled from: SupportedLocaleStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.i18n.store.locale.SupportedLocaleStore", m3645f = "SupportedLocaleStore.kt", m3646l = {59}, m3647m = "getSupportedLocale")
    /* renamed from: com.robinhood.shared.i18n.store.locale.SupportedLocaleStore$getSupportedLocale$1 */
    /* loaded from: classes6.dex */
    static final class C390361 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C390361(Continuation<? super C390361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportedLocaleStore.this.getSupportedLocale(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportedLocaleStore(LocaleBonfireApi localeBonfireApi, @RemoteSupportedLocalePref StringPreference remoteSupportedLocalePref, AppType appType, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(localeBonfireApi, "localeBonfireApi");
        Intrinsics.checkNotNullParameter(remoteSupportedLocalePref, "remoteSupportedLocalePref");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.localeBonfireApi = localeBonfireApi;
        this.remoteSupportedLocalePref = remoteSupportedLocalePref;
        this.appType = appType;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SupportedLocaleStore2(this, null), getLogoutKillswitch(), new SupportedLocaleStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final Flow<Optional<Locale>> streamSupportedLocale() {
        if (this.appType != AppType.RHC) {
            return StateFlow4.MutableStateFlow(Optional3.asOptional(Locale.US));
        }
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.remoteSupportedLocalePref.changes()), Integer.MAX_VALUE, null, 2, null);
        return new Flow<Optional<? extends Locale>>() { // from class: com.robinhood.shared.i18n.store.locale.SupportedLocaleStore$streamSupportedLocale$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.i18n.store.locale.SupportedLocaleStore$streamSupportedLocale$$inlined$map$1$2 */
            public static final class C390352<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.i18n.store.locale.SupportedLocaleStore$streamSupportedLocale$$inlined$map$1$2", m3645f = "SupportedLocaleStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.i18n.store.locale.SupportedLocaleStore$streamSupportedLocale$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C390352.this.emit(null, this);
                    }
                }

                public C390352(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object objAsOptional;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        String str = (String) ((Optional) obj).component1();
                        if (str == null) {
                            objAsOptional = Optional2.INSTANCE;
                        } else {
                            objAsOptional = Optional3.asOptional(Locale.forLanguageTag(str));
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(objAsOptional, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends Locale>> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C390352(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.shared.i18n.locale.SupportedLocaleRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSupportedLocale(Locale locale, Continuation<? super Locale> continuation) {
        C390361 c390361;
        if (continuation instanceof C390361) {
            c390361 = (C390361) continuation;
            int i = c390361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c390361.label = i - Integer.MIN_VALUE;
            } else {
                c390361 = new C390361(continuation);
            }
        }
        Object objM28790withTimeoutOrNullKLykuaI = c390361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c390361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM28790withTimeoutOrNullKLykuaI);
            if (this.appType != AppType.RHC) {
                return locale;
            }
            Duration.Companion companion = Duration.INSTANCE;
            long duration = Duration3.toDuration(10, DurationUnitJvm.SECONDS);
            C390372 c390372 = new C390372(null);
            c390361.L$0 = locale;
            c390361.label = 1;
            objM28790withTimeoutOrNullKLykuaI = Timeout6.m28790withTimeoutOrNullKLykuaI(duration, c390372, c390361);
            if (objM28790withTimeoutOrNullKLykuaI == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            locale = (Locale) c390361.L$0;
            ResultKt.throwOnFailure(objM28790withTimeoutOrNullKLykuaI);
        }
        Locale locale2 = (Locale) objM28790withTimeoutOrNullKLykuaI;
        return locale2 == null ? locale : locale2;
    }

    /* compiled from: SupportedLocaleStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.i18n.store.locale.SupportedLocaleStore$getSupportedLocale$2", m3645f = "SupportedLocaleStore.kt", m3646l = {60, 61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.i18n.store.locale.SupportedLocaleStore$getSupportedLocale$2 */
    /* loaded from: classes6.dex */
    static final class C390372 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Locale>, Object> {
        Object L$0;
        int label;

        C390372(Continuation<? super C390372> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportedLocaleStore.this.new C390372(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Locale> continuation) {
            return ((C390372) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String androidLanguageTag;
            SupportedLocaleStore supportedLocaleStore;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StringPreference stringPreference = SupportedLocaleStore.this.remoteSupportedLocalePref;
                this.label = 1;
                obj = stringPreference.coGet(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                supportedLocaleStore = (SupportedLocaleStore) this.L$0;
                ResultKt.throwOnFailure(obj);
                androidLanguageTag = supportedLocaleStore.toAndroidLanguageTag(((ApiRemoteSupportedLocale) obj).getSupportedLocale());
                return Locale.forLanguageTag(androidLanguageTag);
            }
            ResultKt.throwOnFailure(obj);
            androidLanguageTag = (String) obj;
            if (androidLanguageTag == null) {
                SupportedLocaleStore supportedLocaleStore2 = SupportedLocaleStore.this;
                Endpoint endpoint = supportedLocaleStore2.endpoint;
                Unit unit = Unit.INSTANCE;
                this.L$0 = supportedLocaleStore2;
                this.label = 2;
                Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
                if (objForceFetch$default != coroutine_suspended) {
                    supportedLocaleStore = supportedLocaleStore2;
                    obj = objForceFetch$default;
                    androidLanguageTag = supportedLocaleStore.toAndroidLanguageTag(((ApiRemoteSupportedLocale) obj).getSupportedLocale());
                }
                return coroutine_suspended;
            }
            return Locale.forLanguageTag(androidLanguageTag);
        }
    }

    public static /* synthetic */ void refreshSupportedLocale$default(SupportedLocaleStore supportedLocaleStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        supportedLocaleStore.refreshSupportedLocale(z);
    }

    public final void refreshSupportedLocale(boolean force) {
        if (this.appType != AppType.RHC) {
            return;
        }
        Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toAndroidLanguageTag(String str) {
        return StringsKt.replace$default(str, "_", "-", false, 4, (Object) null);
    }
}
