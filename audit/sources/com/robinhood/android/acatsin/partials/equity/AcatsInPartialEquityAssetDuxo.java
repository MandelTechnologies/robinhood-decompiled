package com.robinhood.android.acatsin.partials.equity;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.acatsin.borrowingfee.UiShortPositionFeeData;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetEvent;
import com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment;
import com.robinhood.android.acatsin.util.PositionAmountFormatting;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.shared.equities.store.subzero.ShortingInfoStore;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsInPartialEquityAssetDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetViewState;", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "shortingStore", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getShortingStore", "()Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setAllSharesChecked", "checked", "", "setAmount", "amountText", "", "setPositionType", "direction", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "fetchBorrowingFee", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showBorrowingFeeBottomSheet", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPartialEquityAssetDuxo extends BaseDuxo5<AcatsInPartialEquityAssetViewState, AcatsInPartialEquityAssetEvent> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final ShortingInfoStore shortingStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsInPartialEquityAssetDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo", m3645f = "AcatsInPartialEquityAssetDuxo.kt", m3646l = {101}, m3647m = "fetchBorrowingFee")
    /* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$fetchBorrowingFee$1 */
    static final class C79811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C79811(Continuation<? super C79811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcatsInPartialEquityAssetDuxo.this.fetchBorrowingFee(this);
        }
    }

    public final ShortingInfoStore getShortingStore() {
        return this.shortingStore;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInPartialEquityAssetDuxo(ShortingInfoStore shortingStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(shortingStore, "shortingStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new AcatsInPartialEquityAssetViewState(((AcatsInPartialEquityAssetFragment.Args) companion.getArgs(savedStateHandle)).getInstrumentId(), ((AcatsInPartialEquityAssetFragment.Args) companion.getArgs(savedStateHandle)).getSymbol(), ((AcatsInPartialEquityAssetFragment.Args) companion.getArgs(savedStateHandle)).getName(), ((AcatsInPartialEquityAssetFragment.Args) companion.getArgs(savedStateHandle)).getAssetToModify(), false, null, null, null, null, null, null, false, 4080, null), duxoBundle);
        this.shortingStore = shortingStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C79841(null), 3, null);
    }

    /* compiled from: AcatsInPartialEquityAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$onCreate$1", m3645f = "AcatsInPartialEquityAssetDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$onCreate$1 */
    static final class C79841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C79841(Continuation<? super C79841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPartialEquityAssetDuxo.this.new C79841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (((AcatsInPartialEquityAssetFragment.Args) AcatsInPartialEquityAssetDuxo.INSTANCE.getArgs((HasSavedState) AcatsInPartialEquityAssetDuxo.this)).getHasSubzeroExperiment()) {
                    AcatsInPartialEquityAssetDuxo acatsInPartialEquityAssetDuxo = AcatsInPartialEquityAssetDuxo.this;
                    this.label = 1;
                    if (acatsInPartialEquityAssetDuxo.fetchBorrowingFee(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            UiAcatsAsset.EquityAsset assetToModify = ((AcatsInPartialEquityAssetFragment.Args) AcatsInPartialEquityAssetDuxo.INSTANCE.getArgs((HasSavedState) AcatsInPartialEquityAssetDuxo.this)).getAssetToModify();
            if (assetToModify != null) {
                AcatsInPartialEquityAssetDuxo.this.submit(new AcatsInPartialEquityAssetEvent.PopulateEditUi(assetToModify));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AcatsInPartialEquityAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$setAllSharesChecked$1", m3645f = "AcatsInPartialEquityAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$setAllSharesChecked$1 */
    static final class C79851 extends ContinuationImpl7 implements Function2<AcatsInPartialEquityAssetViewState, Continuation<? super AcatsInPartialEquityAssetViewState>, Object> {
        final /* synthetic */ boolean $checked;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79851(boolean z, Continuation<? super C79851> continuation) {
            super(2, continuation);
            this.$checked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79851 c79851 = new C79851(this.$checked, continuation);
            c79851.L$0 = obj;
            return c79851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState, Continuation<? super AcatsInPartialEquityAssetViewState> continuation) {
            return ((C79851) create(acatsInPartialEquityAssetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialEquityAssetViewState.copy$default((AcatsInPartialEquityAssetViewState) this.L$0, null, null, null, null, this.$checked, null, null, null, null, null, null, false, 4079, null);
        }
    }

    public final void setAllSharesChecked(boolean checked) {
        applyMutation(new C79851(checked, null));
    }

    public final void setAmount(CharSequence amountText) {
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        String amountForPosition = PositionAmountFormatting.formatAmountForPosition(amountText.toString(), getStateFlow().getValue().getSelectedPosition() == ApiAcatsTransfer.Asset.Direction.SHORT);
        applyMutation(new C79861(StringsKt.toIntOrNull(StringsKt.removePrefix(amountForPosition, "-")), amountForPosition, null));
    }

    /* compiled from: AcatsInPartialEquityAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$setAmount$1", m3645f = "AcatsInPartialEquityAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$setAmount$1 */
    static final class C79861 extends ContinuationImpl7 implements Function2<AcatsInPartialEquityAssetViewState, Continuation<? super AcatsInPartialEquityAssetViewState>, Object> {
        final /* synthetic */ String $formattedText;
        final /* synthetic */ Integer $intValue;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79861(Integer num, String str, Continuation<? super C79861> continuation) {
            super(2, continuation);
            this.$intValue = num;
            this.$formattedText = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79861 c79861 = new C79861(this.$intValue, this.$formattedText, continuation);
            c79861.L$0 = obj;
            return c79861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState, Continuation<? super AcatsInPartialEquityAssetViewState> continuation) {
            return ((C79861) create(acatsInPartialEquityAssetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialEquityAssetViewState.copy$default((AcatsInPartialEquityAssetViewState) this.L$0, null, null, null, null, false, this.$intValue, this.$formattedText, null, null, null, null, false, 3999, null);
        }
    }

    public final void setPositionType(ApiAcatsTransfer.Asset.Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        String amountText = getStateFlow().getValue().getAmountText();
        boolean z = direction == ApiAcatsTransfer.Asset.Direction.SHORT;
        if (amountText.length() > 0) {
            amountText = PositionAmountFormatting.formatAmountForPosition(amountText, z);
        }
        applyMutation(new C79871(amountText, direction, null));
    }

    /* compiled from: AcatsInPartialEquityAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$setPositionType$1", m3645f = "AcatsInPartialEquityAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$setPositionType$1 */
    static final class C79871 extends ContinuationImpl7 implements Function2<AcatsInPartialEquityAssetViewState, Continuation<? super AcatsInPartialEquityAssetViewState>, Object> {
        final /* synthetic */ ApiAcatsTransfer.Asset.Direction $direction;
        final /* synthetic */ String $reformattedText;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79871(String str, ApiAcatsTransfer.Asset.Direction direction, Continuation<? super C79871> continuation) {
            super(2, continuation);
            this.$reformattedText = str;
            this.$direction = direction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79871 c79871 = new C79871(this.$reformattedText, this.$direction, continuation);
            c79871.L$0 = obj;
            return c79871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState, Continuation<? super AcatsInPartialEquityAssetViewState> continuation) {
            return ((C79871) create(acatsInPartialEquityAssetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialEquityAssetViewState.copy$default((AcatsInPartialEquityAssetViewState) this.L$0, null, null, null, null, false, null, this.$reformattedText, null, this.$direction, null, null, false, 3775, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchBorrowingFee(Continuation<? super Unit> continuation) {
        C79811 c79811;
        Object objM28550constructorimpl;
        if (continuation instanceof C79811) {
            c79811 = (C79811) continuation;
            int i = c79811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c79811.label = i - Integer.MIN_VALUE;
            } else {
                c79811 = new C79811(continuation);
            }
        }
        Object shortingInfoOnce = c79811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c79811.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(shortingInfoOnce);
                Result.Companion companion = Result.INSTANCE;
                ShortingInfoStore shortingInfoStore = this.shortingStore;
                UUID instrumentId = ((AcatsInPartialEquityAssetFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId();
                c79811.label = 1;
                shortingInfoOnce = shortingInfoStore.getShortingInfoOnce(instrumentId, c79811);
                if (shortingInfoOnce == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(shortingInfoOnce);
            }
            ShortingInfo shortingInfo = (ShortingInfo) shortingInfoOnce;
            objM28550constructorimpl = Result.m28550constructorimpl(shortingInfo != null ? shortingInfo.getFee() : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                objM28550constructorimpl = null;
            }
            applyMutation(new C79822((BigDecimal) objM28550constructorimpl, this, null));
        } else {
            CrashReporter.Companion companion3 = CrashReporter.INSTANCE;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                thM28553exceptionOrNullimpl = new UnknownError();
            }
            SentryTeam sentryTeam = SentryTeam.ACATS;
            Companion companion4 = INSTANCE;
            companion3.reportNonFatal(thM28553exceptionOrNullimpl, false, new EventMetadata(sentryTeam, MapsKt.mapOf(Tuples4.m3642to("instrumentId", ((AcatsInPartialEquityAssetFragment.Args) companion4.getArgs((HasSavedState) this)).getInstrumentId().toString()), Tuples4.m3642to("symbol", ((AcatsInPartialEquityAssetFragment.Args) companion4.getArgs((HasSavedState) this)).getSymbol())), null, 4, null));
            applyMutation(new C79833(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInPartialEquityAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$fetchBorrowingFee$2", m3645f = "AcatsInPartialEquityAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$fetchBorrowingFee$2 */
    static final class C79822 extends ContinuationImpl7 implements Function2<AcatsInPartialEquityAssetViewState, Continuation<? super AcatsInPartialEquityAssetViewState>, Object> {
        final /* synthetic */ BigDecimal $feeForAsset;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AcatsInPartialEquityAssetDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79822(BigDecimal bigDecimal, AcatsInPartialEquityAssetDuxo acatsInPartialEquityAssetDuxo, Continuation<? super C79822> continuation) {
            super(2, continuation);
            this.$feeForAsset = bigDecimal;
            this.this$0 = acatsInPartialEquityAssetDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79822 c79822 = new C79822(this.$feeForAsset, this.this$0, continuation);
            c79822.L$0 = obj;
            return c79822;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState, Continuation<? super AcatsInPartialEquityAssetViewState> continuation) {
            return ((C79822) create(acatsInPartialEquityAssetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState = (AcatsInPartialEquityAssetViewState) this.L$0;
            UiAcatsAsset.EquityAsset assetToModify = acatsInPartialEquityAssetViewState.getAssetToModify();
            UiAcatsAsset.EquityAsset equityAssetCopy$default = assetToModify != null ? UiAcatsAsset.EquityAsset.copy$default(assetToModify, null, null, null, null, null, this.$feeForAsset, 31, null) : null;
            BigDecimal bigDecimal = this.$feeForAsset;
            return AcatsInPartialEquityAssetViewState.copy$default(acatsInPartialEquityAssetViewState, null, null, null, equityAssetCopy$default, false, null, null, null, null, bigDecimal, boxing.boxBoolean(bigDecimal != null), ((AcatsInPartialEquityAssetFragment.Args) AcatsInPartialEquityAssetDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getHasSubzeroExperiment(), 503, null);
        }
    }

    /* compiled from: AcatsInPartialEquityAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$fetchBorrowingFee$3", m3645f = "AcatsInPartialEquityAssetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetDuxo$fetchBorrowingFee$3 */
    static final class C79833 extends ContinuationImpl7 implements Function2<AcatsInPartialEquityAssetViewState, Continuation<? super AcatsInPartialEquityAssetViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C79833(Continuation<? super C79833> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79833 c79833 = new C79833(continuation);
            c79833.L$0 = obj;
            return c79833;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState, Continuation<? super AcatsInPartialEquityAssetViewState> continuation) {
            return ((C79833) create(acatsInPartialEquityAssetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInPartialEquityAssetViewState.copy$default((AcatsInPartialEquityAssetViewState) this.L$0, null, null, null, null, false, null, null, null, null, null, boxing.boxBoolean(false), false, 2559, null);
        }
    }

    public final void showBorrowingFeeBottomSheet() {
        BigDecimal borrowFee = getStateFlow().getValue().getBorrowFee();
        if (borrowFee != null) {
            submit(new AcatsInPartialEquityAssetEvent.ShowBorrowingFeeBottomSheet(new UiShortPositionFeeData(((AcatsInPartialEquityAssetFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSymbol(), borrowFee)));
        }
    }

    /* compiled from: AcatsInPartialEquityAssetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetDuxo;", "Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetFragment$Args;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInPartialEquityAssetDuxo, AcatsInPartialEquityAssetFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPartialEquityAssetFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInPartialEquityAssetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPartialEquityAssetFragment.Args getArgs(AcatsInPartialEquityAssetDuxo acatsInPartialEquityAssetDuxo) {
            return (AcatsInPartialEquityAssetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, acatsInPartialEquityAssetDuxo);
        }
    }
}
