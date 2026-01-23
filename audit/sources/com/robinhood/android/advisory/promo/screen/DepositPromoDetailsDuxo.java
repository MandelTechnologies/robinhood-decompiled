package com.robinhood.android.advisory.promo.screen;

import advisory.proto.p008v1.GetDepositPromoDetailsResponseDto;
import advisory.proto.p008v1.PromoDetailsScreenDto;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.contracts.AdvisoryDepositPromoDetailsFragmentKey;
import com.robinhood.android.advisory.promo.screen.DepositPromoDetailsViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.promo.DepositPromoCard3;
import com.robinhood.models.advisory.p304db.promo.PromoDetailsScreen;
import com.robinhood.store.advisory.AdvisoryDepositPromoDetailsStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DepositPromoDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "promoDetailsStore", "Lcom/robinhood/store/advisory/AdvisoryDepositPromoDetailsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/store/advisory/AdvisoryDepositPromoDetailsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-advisory-promo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DepositPromoDetailsDuxo extends BaseDuxo4<DepositPromoDetailsViewState> implements HasSavedState {
    private final AdvisoryDepositPromoDetailsStore promoDetailsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositPromoDetailsDuxo(DuxoBundle duxoBundle, AdvisoryDepositPromoDetailsStore promoDetailsStore, SavedStateHandle savedStateHandle) {
        super(DepositPromoDetailsViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(promoDetailsStore, "promoDetailsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.promoDetailsStore = promoDetailsStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: DepositPromoDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsDuxo$onStart$1", m3645f = "DepositPromoDetailsDuxo.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsDuxo$onStart$1 */
    static final class C93271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C93271(Continuation<? super C93271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DepositPromoDetailsDuxo.this.new C93271(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C93271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AdvisoryDepositPromoDetailsStore advisoryDepositPromoDetailsStore = DepositPromoDetailsDuxo.this.promoDetailsStore;
                    Companion companion = DepositPromoDetailsDuxo.INSTANCE;
                    String campaign = ((AdvisoryDepositPromoDetailsFragmentKey) companion.getArgs((HasSavedState) DepositPromoDetailsDuxo.this)).getCampaign();
                    boolean zIsIraTransfer = ((AdvisoryDepositPromoDetailsFragmentKey) companion.getArgs((HasSavedState) DepositPromoDetailsDuxo.this)).isIraTransfer();
                    this.label = 1;
                    obj = advisoryDepositPromoDetailsStore.fetchPromoDetails(campaign, zIsIraTransfer, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                PromoDetailsScreenDto details_screen = ((GetDepositPromoDetailsResponseDto) obj).getDetails_screen();
                DepositPromoDetailsDuxo.this.applyMutation(new AnonymousClass1(details_screen != null ? DepositPromoCard3.toDbModel(details_screen) : null, null));
            } catch (Exception unused) {
                DepositPromoDetailsDuxo.this.applyMutation(new AnonymousClass2(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: DepositPromoDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsDuxo$onStart$1$1", m3645f = "DepositPromoDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DepositPromoDetailsViewState, Continuation<? super DepositPromoDetailsViewState>, Object> {
            final /* synthetic */ PromoDetailsScreen $details;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PromoDetailsScreen promoDetailsScreen, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$details = promoDetailsScreen;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$details, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DepositPromoDetailsViewState depositPromoDetailsViewState, Continuation<? super DepositPromoDetailsViewState> continuation) {
                return ((AnonymousClass1) create(depositPromoDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$details == null) {
                    return DepositPromoDetailsViewState.Error.INSTANCE;
                }
                return new DepositPromoDetailsViewState.Loaded(this.$details);
            }
        }

        /* compiled from: DepositPromoDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.promo.screen.DepositPromoDetailsDuxo$onStart$1$2", m3645f = "DepositPromoDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.promo.screen.DepositPromoDetailsDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DepositPromoDetailsViewState, Continuation<? super DepositPromoDetailsViewState>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DepositPromoDetailsViewState depositPromoDetailsViewState, Continuation<? super DepositPromoDetailsViewState> continuation) {
                return ((AnonymousClass2) create(depositPromoDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return DepositPromoDetailsViewState.Error.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C93271(null));
    }

    /* compiled from: DepositPromoDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/promo/screen/DepositPromoDetailsDuxo;", "Lcom/robinhood/android/advisory/contracts/AdvisoryDepositPromoDetailsFragmentKey;", "<init>", "()V", "feature-advisory-promo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DepositPromoDetailsDuxo, AdvisoryDepositPromoDetailsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryDepositPromoDetailsFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryDepositPromoDetailsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryDepositPromoDetailsFragmentKey getArgs(DepositPromoDetailsDuxo depositPromoDetailsDuxo) {
            return (AdvisoryDepositPromoDetailsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, depositPromoDetailsDuxo);
        }
    }
}
