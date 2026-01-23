package com.robinhood.android.crypto.pulse;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRefreshResponseDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedResponseDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cortex.contracts.AssetDigestFragmentKey;
import com.robinhood.android.cortex.contracts.AssetDigestValuePropsExperiment;
import com.robinhood.android.cortex.contracts.AssetDigestValuePropsExperiment2;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.cortex.models.asset.AssetDigest4;
import com.robinhood.android.crypto.pulse.CryptoPulseEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CryptoPulseStore;
import com.robinhood.shared.crypto.contracts.pulse.CryptoPulseIntentKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoPulseDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0006\u0010\u0012\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0003J\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/crypto/pulse/CryptoPulseEvent;", "cryptoPulseStore", "Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "fetchSignedAgreementStatusForFeed", "fetchSignedAgreementStatusForDigestFragment", "fragmentKey", "Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "pollSignedAgreementStatusForFeedUntilSigned", "emitShowFeedEvent", "feedResponse", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoPulseDuxo extends BaseDuxo5<Unit, CryptoPulseEvent> implements HasSavedState {
    private final CryptoPulseStore cryptoPulseStore;
    private final ExperimentsProvider experimentsProvider;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoPulseDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.CryptoPulseDuxo", m3645f = "CryptoPulseDuxo.kt", m3646l = {112}, m3647m = "emitShowFeedEvent")
    /* renamed from: com.robinhood.android.crypto.pulse.CryptoPulseDuxo$emitShowFeedEvent$1 */
    static final class C129191 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C129191(Continuation<? super C129191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoPulseDuxo.this.emitShowFeedEvent(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPulseDuxo(CryptoPulseStore cryptoPulseStore, ExperimentsProvider experimentsProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoPulseStore, "cryptoPulseStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.cryptoPulseStore = cryptoPulseStore;
        this.experimentsProvider = experimentsProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        if (((CryptoPulseIntentKey) INSTANCE.getExtras((HasSavedState) this)).getDestinationOverride() == null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C129211(null), 3, null);
        }
    }

    /* compiled from: CryptoPulseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.CryptoPulseDuxo$onCreate$1", m3645f = "CryptoPulseDuxo.kt", m3646l = {42, 55}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.pulse.CryptoPulseDuxo$onCreate$1 */
    static final class C129211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C129211(Continuation<? super C129211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C129211 c129211 = CryptoPulseDuxo.this.new C129211(continuation);
            c129211.L$0 = obj;
            return c129211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            CryptoPulseDuxo cryptoPulseDuxo;
            GetCryptoPulsePreviewResponseDto.TapActionDto.TypeDto typeDto;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoPulseDuxo cryptoPulseDuxo2 = CryptoPulseDuxo.this;
                Result.Companion companion2 = Result.INSTANCE;
                CryptoPulseStore cryptoPulseStore = cryptoPulseDuxo2.cryptoPulseStore;
                this.label = 1;
                obj = cryptoPulseStore.getPulsePreview(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    typeDto = (GetCryptoPulsePreviewResponseDto.TapActionDto.TypeDto) this.L$1;
                    cryptoPulseDuxo = (CryptoPulseDuxo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    cryptoPulseDuxo.fetchSignedAgreementStatusForDigestFragment(new AssetDigestFragmentKey(AssetDigest4.toUiModel(((GetCryptoPulsePreviewResponseDto.TapActionDto.TypeDto.ShowDigestDetails) typeDto).getValue()), (AssetDigestValuePropsExperiment2) obj));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((GetCryptoPulsePreviewResponseDto) obj);
            CryptoPulseDuxo cryptoPulseDuxo3 = CryptoPulseDuxo.this;
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
                GetCryptoPulsePreviewResponseDto.TapActionDto tap_action = ((GetCryptoPulsePreviewResponseDto) objM28550constructorimpl).getTap_action();
                GetCryptoPulsePreviewResponseDto.TapActionDto.TypeDto type2 = tap_action != null ? tap_action.getType() : null;
                if (type2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (type2 instanceof GetCryptoPulsePreviewResponseDto.TapActionDto.TypeDto.ShowFeed) {
                    cryptoPulseDuxo3.fetchSignedAgreementStatusForFeed();
                } else {
                    if (!(type2 instanceof GetCryptoPulsePreviewResponseDto.TapActionDto.TypeDto.ShowDigestDetails)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Flow flowCoStreamVariant$default = ExperimentsProvider.DefaultImpls.coStreamVariant$default(cryptoPulseDuxo3.experimentsProvider, AssetDigestValuePropsExperiment.INSTANCE, AssetDigestValuePropsExperiment2.CONTROL, false, 4, null);
                    this.L$0 = cryptoPulseDuxo3;
                    this.L$1 = type2;
                    this.label = 2;
                    Object objFirst = FlowKt.first(flowCoStreamVariant$default, this);
                    if (objFirst != coroutine_suspended) {
                        cryptoPulseDuxo = cryptoPulseDuxo3;
                        typeDto = type2;
                        obj = objFirst;
                        cryptoPulseDuxo.fetchSignedAgreementStatusForDigestFragment(new AssetDigestFragmentKey(AssetDigest4.toUiModel(((GetCryptoPulsePreviewResponseDto.TapActionDto.TypeDto.ShowDigestDetails) typeDto).getValue()), (AssetDigestValuePropsExperiment2) obj));
                    }
                    return coroutine_suspended;
                }
            } else {
                cryptoPulseDuxo3.submit(CryptoPulseEvent.ShowErrorAlert.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoPulseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.CryptoPulseDuxo$fetchSignedAgreementStatusForFeed$1", m3645f = "CryptoPulseDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, 74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.pulse.CryptoPulseDuxo$fetchSignedAgreementStatusForFeed$1 */
    static final class C129201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129201(Continuation<? super C129201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseDuxo.this.new C129201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        
            if (r1.emitShowFeedEvent(r5, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoPulseStore cryptoPulseStore = CryptoPulseDuxo.this.cryptoPulseStore;
                this.label = 1;
                obj = cryptoPulseStore.getPulseFeed(this);
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
            GetCryptoPulseFeedResponseDto getCryptoPulseFeedResponseDto = (GetCryptoPulseFeedResponseDto) obj;
            if (getCryptoPulseFeedResponseDto.getHas_signed_agreement()) {
                CryptoPulseDuxo cryptoPulseDuxo = CryptoPulseDuxo.this;
                this.label = 2;
            } else {
                CryptoPulseDuxo.this.submit(CryptoPulseEvent.ShowPrimerForFeed.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void fetchSignedAgreementStatusForFeed() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C129201(null), 3, null);
    }

    public final void fetchSignedAgreementStatusForDigestFragment(AssetDigestFragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        AssetDigest instrumentDigest = fragmentKey.getInstrumentDigest();
        if (instrumentDigest instanceof AssetDigest.HasSignedAgreement) {
            submit(new CryptoPulseEvent.ShowDigestFragment(fragmentKey));
        } else {
            if (!(instrumentDigest instanceof AssetDigest.NeedsAgreement)) {
                throw new NoWhenBranchMatchedException();
            }
            submit(new CryptoPulseEvent.ShowPrimerForDigestFragment(fragmentKey));
        }
    }

    /* compiled from: CryptoPulseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.CryptoPulseDuxo$pollSignedAgreementStatusForFeedUntilSigned$1", m3645f = "CryptoPulseDuxo.kt", m3646l = {99, 100}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.pulse.CryptoPulseDuxo$pollSignedAgreementStatusForFeedUntilSigned$1 */
    static final class C129221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129221(Continuation<? super C129221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseDuxo.this.new C129221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r1.emitShowFeedEvent((bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedResponseDto) r5, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<GetCryptoPulseFeedResponseDto> flowStreamPulseFeed = CryptoPulseDuxo.this.cryptoPulseStore.streamPulseFeed();
                Flow<GetCryptoPulseFeedResponseDto> flow = new Flow<GetCryptoPulseFeedResponseDto>() { // from class: com.robinhood.android.crypto.pulse.CryptoPulseDuxo$pollSignedAgreementStatusForFeedUntilSigned$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.pulse.CryptoPulseDuxo$pollSignedAgreementStatusForFeedUntilSigned$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.CryptoPulseDuxo$pollSignedAgreementStatusForFeedUntilSigned$1$invokeSuspend$$inlined$filter$1$2", m3645f = "CryptoPulseDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.crypto.pulse.CryptoPulseDuxo$pollSignedAgreementStatusForFeedUntilSigned$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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
                                if (((GetCryptoPulseFeedResponseDto) obj).getHas_signed_agreement()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                    public Object collect(FlowCollector<? super GetCryptoPulseFeedResponseDto> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamPulseFeed.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                obj = FlowKt.first(flow, this);
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
            CryptoPulseDuxo cryptoPulseDuxo = CryptoPulseDuxo.this;
            this.label = 2;
        }
    }

    public final void pollSignedAgreementStatusForFeedUntilSigned() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C129221(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitShowFeedEvent(GetCryptoPulseFeedResponseDto getCryptoPulseFeedResponseDto, Continuation<? super Unit> continuation) {
        C129191 c129191;
        GetCryptoPulseFeedRefreshResponseDto getCryptoPulseFeedRefreshResponseDto;
        if (continuation instanceof C129191) {
            c129191 = (C129191) continuation;
            int i = c129191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c129191.label = i - Integer.MIN_VALUE;
            } else {
                c129191 = new C129191(continuation);
            }
        }
        Object initialPulseFeedRefresh = c129191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c129191.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.throwOnFailure(initialPulseFeedRefresh);
            List<String> sorted_currency_pair_ids = getCryptoPulseFeedResponseDto.getSorted_currency_pair_ids();
            if (sorted_currency_pair_ids.isEmpty()) {
                getCryptoPulseFeedRefreshResponseDto = new GetCryptoPulseFeedRefreshResponseDto(null, i3, 0 == true ? 1 : 0);
                submit(new CryptoPulseEvent.ShowFeed(getCryptoPulseFeedResponseDto, getCryptoPulseFeedRefreshResponseDto));
                return Unit.INSTANCE;
            }
            CryptoPulseStore cryptoPulseStore = this.cryptoPulseStore;
            c129191.L$0 = getCryptoPulseFeedResponseDto;
            c129191.label = 1;
            initialPulseFeedRefresh = cryptoPulseStore.getInitialPulseFeedRefresh(sorted_currency_pair_ids, c129191);
            if (initialPulseFeedRefresh == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getCryptoPulseFeedResponseDto = (GetCryptoPulseFeedResponseDto) c129191.L$0;
            ResultKt.throwOnFailure(initialPulseFeedRefresh);
        }
        getCryptoPulseFeedRefreshResponseDto = (GetCryptoPulseFeedRefreshResponseDto) initialPulseFeedRefresh;
        submit(new CryptoPulseEvent.ShowFeed(getCryptoPulseFeedResponseDto, getCryptoPulseFeedRefreshResponseDto));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoPulseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/CryptoPulseDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/crypto/pulse/CryptoPulseDuxo;", "Lcom/robinhood/shared/crypto/contracts/pulse/CryptoPulseIntentKey;", "<init>", "()V", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<CryptoPulseDuxo, CryptoPulseIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CryptoPulseIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (CryptoPulseIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CryptoPulseIntentKey getExtras(CryptoPulseDuxo cryptoPulseDuxo) {
            return (CryptoPulseIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, cryptoPulseDuxo);
        }
    }
}
