package com.robinhood.android.crypto.tab.p093ui.education;

import com.robinhood.android.engagement.cryptoEducationTrading.CryptoEducationTradingEligibilityStore;
import com.robinhood.android.regiongate.PerpetualsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.CompletedEducationLessonsPref;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSeries;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.StringsKt;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CryptoHomeEducationDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cBC\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0081@¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDataState;", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationViewState;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "educationLessonStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "cryptoEducationTradingEligibilityStore", "Lcom/robinhood/android/engagement/cryptoEducationTrading/CryptoEducationTradingEligibilityStore;", "completedEducationLessonsPref", "Lcom/robinhood/prefs/StringPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationStateProvider;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/engagement/cryptoEducationTrading/CryptoEducationTradingEligibilityStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationStateProvider;)V", "onCreate", "", "getSeriesId", "", "isPerpetualsEnabled", "", "getSeriesId$feature_crypto_tab_externalDebug", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeEducationDuxo extends BaseDuxo<CryptoHomeEducationDataState, CryptoHomeEducationViewState> {
    public static final String CRYPTO_HOME_LOCATION = "crypto_home";
    public static final String RHC_PERPETUALS_ENABLED_SERIES_ID = "456ufFM29xU5orFpdgHGNh";
    public static final String RHC_SERIES_ID = "6sG8QFElRgBHSA30a9Sw3c";
    public static final String TRADER_SERIES_ID = "5XDAfpipGm403GhOUc5XYj";
    private final AppType appType;
    private final StringPreference completedEducationLessonsPref;
    private final CryptoEducationTradingEligibilityStore cryptoEducationTradingEligibilityStore;
    private final EducationLessonsStore educationLessonStore;
    private final RegionGateProvider regionGateProvider;
    public static final int $stable = 8;

    /* compiled from: CryptoHomeEducationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHomeEducationDuxo(AppType appType, EducationLessonsStore educationLessonStore, RegionGateProvider regionGateProvider, CryptoEducationTradingEligibilityStore cryptoEducationTradingEligibilityStore, @CompletedEducationLessonsPref StringPreference completedEducationLessonsPref, DuxoBundle duxoBundle, CryptoHomeEducationDuxo3 stateProvider) {
        super(new CryptoHomeEducationDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(educationLessonStore, "educationLessonStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(cryptoEducationTradingEligibilityStore, "cryptoEducationTradingEligibilityStore");
        Intrinsics.checkNotNullParameter(completedEducationLessonsPref, "completedEducationLessonsPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.appType = appType;
        this.educationLessonStore = educationLessonStore;
        this.regionGateProvider = regionGateProvider;
        this.cryptoEducationTradingEligibilityStore = cryptoEducationTradingEligibilityStore;
        this.completedEducationLessonsPref = completedEducationLessonsPref;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C131371(null));
    }

    /* compiled from: CryptoHomeEducationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1", m3645f = "CryptoHomeEducationDuxo.kt", m3646l = {48, 49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1 */
    static final class C131371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C131371(Continuation<? super C131371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C131371 c131371 = CryptoHomeEducationDuxo.this.new C131371(continuation);
            c131371.L$0 = obj;
            return c131371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C131371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(CryptoHomeEducationDuxo.this.regionGateProvider, PerpetualsRegionGate.INSTANCE, false, 2, null);
                this.L$0 = coroutineScope3;
                this.label = 1;
                Object objFirstOrNull = FlowKt.firstOrNull(flowStreamRegionGateStateFlow$default, this);
                if (objFirstOrNull != coroutine_suspended) {
                    coroutineScope = coroutineScope3;
                    obj = objFirstOrNull;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope2 = coroutineScope4;
                String str = (String) obj;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(CryptoHomeEducationDuxo.this, str, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass2(CryptoHomeEducationDuxo.this, str, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass3(CryptoHomeEducationDuxo.this, str, null), 3, null);
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            CryptoHomeEducationDuxo cryptoHomeEducationDuxo = CryptoHomeEducationDuxo.this;
            this.L$0 = coroutineScope;
            this.label = 2;
            obj = cryptoHomeEducationDuxo.getSeriesId$feature_crypto_tab_externalDebug(zBooleanValue, this);
            if (obj != coroutine_suspended) {
                coroutineScope2 = coroutineScope;
                String str2 = (String) obj;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(CryptoHomeEducationDuxo.this, str2, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass2(CryptoHomeEducationDuxo.this, str2, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass3(CryptoHomeEducationDuxo.this, str2, null), 3, null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        /* compiled from: CryptoHomeEducationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$1", m3645f = "CryptoHomeEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $seriesId;
            int label;
            final /* synthetic */ CryptoHomeEducationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeEducationDuxo cryptoHomeEducationDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeEducationDuxo;
                this.$seriesId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$seriesId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.educationLessonStore.refreshEducationSeries(this.$seriesId, false);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: CryptoHomeEducationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$2", m3645f = "CryptoHomeEducationDuxo.kt", m3646l = {59}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $seriesId;
            int label;
            final /* synthetic */ CryptoHomeEducationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoHomeEducationDuxo cryptoHomeEducationDuxo, String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeEducationDuxo;
                this.$seriesId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$seriesId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<EducationSeries> flowCoStreamEducationSeries = this.this$0.educationLessonStore.coStreamEducationSeries(this.$seriesId);
                    Flow<List<? extends EducationLessonPreview>> flow = new Flow<List<? extends EducationLessonPreview>>() { // from class: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoHomeEducationDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
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
                                    List<EducationLessonPreview> lessons = ((EducationSeries) obj).getLessons();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(lessons, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super List<? extends EducationLessonPreview>> flowCollector, Continuation continuation) {
                            Object objCollect = flowCoStreamEducationSeries.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    C497532 c497532 = new C497532(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c497532, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoHomeEducationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$2$2", m3645f = "CryptoHomeEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C497532 extends ContinuationImpl7 implements Function2<List<? extends EducationLessonPreview>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoHomeEducationDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497532(CryptoHomeEducationDuxo cryptoHomeEducationDuxo, Continuation<? super C497532> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoHomeEducationDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497532 c497532 = new C497532(this.this$0, continuation);
                    c497532.L$0 = obj;
                    return c497532;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends EducationLessonPreview> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<EducationLessonPreview>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<EducationLessonPreview> list, Continuation<? super Unit> continuation) {
                    return ((C497532) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoHomeEducationDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$2$2$1", m3645f = "CryptoHomeEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoHomeEducationDataState, Continuation<? super CryptoHomeEducationDataState>, Object> {
                    final /* synthetic */ List<EducationLessonPreview> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<EducationLessonPreview> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoHomeEducationDataState cryptoHomeEducationDataState, Continuation<? super CryptoHomeEducationDataState> continuation) {
                        return ((AnonymousClass1) create(cryptoHomeEducationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((CryptoHomeEducationDataState) this.L$0).copy(this.$it);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: CryptoHomeEducationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$3", m3645f = "CryptoHomeEducationDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $seriesId;
            int label;
            final /* synthetic */ CryptoHomeEducationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoHomeEducationDuxo cryptoHomeEducationDuxo, String str, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeEducationDuxo;
                this.$seriesId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$seriesId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.completedEducationLessonsPref.changes()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$seriesId, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoHomeEducationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$3$1", m3645f = "CryptoHomeEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends String>, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $seriesId;
                int label;
                final /* synthetic */ CryptoHomeEducationDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoHomeEducationDuxo cryptoHomeEducationDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoHomeEducationDuxo;
                    this.$seriesId = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$seriesId, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<String> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends String> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<String>) optional, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.educationLessonStore.refreshEducationSeries(this.$seriesId, true);
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSeriesId$feature_crypto_tab_externalDebug(boolean z, Continuation<? super String> continuation) {
        CryptoHomeEducationDuxo2 cryptoHomeEducationDuxo2;
        if (continuation instanceof CryptoHomeEducationDuxo2) {
            cryptoHomeEducationDuxo2 = (CryptoHomeEducationDuxo2) continuation;
            int i = cryptoHomeEducationDuxo2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cryptoHomeEducationDuxo2.label = i - Integer.MIN_VALUE;
            } else {
                cryptoHomeEducationDuxo2 = new CryptoHomeEducationDuxo2(this, continuation);
            }
        }
        Object objFirst = cryptoHomeEducationDuxo2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cryptoHomeEducationDuxo2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFirst);
                if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1) {
                    if (z) {
                        return RHC_PERPETUALS_ENABLED_SERIES_ID;
                    }
                    return RHC_SERIES_ID;
                }
                Flow<String> flowStreamCryptoEducationTradingSeriesId = this.cryptoEducationTradingEligibilityStore.streamCryptoEducationTradingSeriesId(CRYPTO_HOME_LOCATION);
                cryptoHomeEducationDuxo2.label = 1;
                objFirst = FlowKt.first(flowStreamCryptoEducationTradingSeriesId, cryptoHomeEducationDuxo2);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirst);
            }
            String strNullIfEmpty = StringsKt.nullIfEmpty((String) objFirst);
            return strNullIfEmpty == null ? TRADER_SERIES_ID : strNullIfEmpty;
        } catch (Exception unused) {
            return TRADER_SERIES_ID;
        }
    }
}
