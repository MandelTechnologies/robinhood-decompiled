package com.robinhood.android.internalassettransfers.customselection.equity;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditEvent;
import com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditFragment;
import com.robinhood.android.internalassettransfers.customselection.equity.ShareSelection;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.extensions.StringsKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferEquityEditDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00112\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDataState;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditViewState;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onSelectionTypeTapped", "", "selectionType", "Lcom/robinhood/android/internalassettransfers/customselection/equity/SelectionType;", "onConfirmClicked", "updateUserCurrentlyEditing", "isUserCurrentlyEditing", "", "onKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InternalAssetTransferEquityEditDuxo extends BaseDuxo3<InternalAssetTransferEquityEditDataState, InternalAssetTransferEquityEditViewState, InternalAssetTransferEquityEditEvent> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InternalAssetTransferEquityEditDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareSelection2.values().length];
            try {
                iArr[ShareSelection2.ALL_SHARES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareSelection2.SPECIFIC_AMOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InternalAssetTransferEquityEditDuxo(InternalAssetTransferEquityEditStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        ShareSelection2 shareSelection2;
        String string2;
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        ShareSelection existingShareSelection = ((InternalAssetTransferEquityEditFragment.Args) companion.getArgs(savedStateHandle)).getExistingShareSelection();
        if (existingShareSelection instanceof ShareSelection.AllShares) {
            shareSelection2 = ShareSelection2.ALL_SHARES;
        } else {
            if (!(existingShareSelection instanceof ShareSelection.SpecificShares)) {
                throw new NoWhenBranchMatchedException();
            }
            shareSelection2 = ShareSelection2.SPECIFIC_AMOUNT;
        }
        ShareSelection2 shareSelection22 = shareSelection2;
        ShareSelection existingShareSelection2 = ((InternalAssetTransferEquityEditFragment.Args) companion.getArgs(savedStateHandle)).getExistingShareSelection();
        if (existingShareSelection2 instanceof ShareSelection.AllShares) {
            string2 = "";
        } else {
            if (!(existingShareSelection2 instanceof ShareSelection.SpecificShares)) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = ((ShareSelection.SpecificShares) existingShareSelection2).getShares().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        }
        super(new InternalAssetTransferEquityEditDataState(((InternalAssetTransferEquityEditFragment.Args) companion.getArgs(savedStateHandle)).getAsset(), shareSelection22, string2, false, 8, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: InternalAssetTransferEquityEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$onSelectionTypeTapped$1", m3645f = "InternalAssetTransferEquityEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$onSelectionTypeTapped$1 */
    static final class C191701 extends ContinuationImpl7 implements Function2<InternalAssetTransferEquityEditDataState, Continuation<? super InternalAssetTransferEquityEditDataState>, Object> {
        final /* synthetic */ ShareSelection2 $selectionType;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: InternalAssetTransferEquityEditDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$onSelectionTypeTapped$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ShareSelection2.values().length];
                try {
                    iArr[ShareSelection2.ALL_SHARES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ShareSelection2.SPECIFIC_AMOUNT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191701(ShareSelection2 shareSelection2, Continuation<? super C191701> continuation) {
            super(2, continuation);
            this.$selectionType = shareSelection2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191701 c191701 = new C191701(this.$selectionType, continuation);
            c191701.L$0 = obj;
            return c191701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferEquityEditDataState internalAssetTransferEquityEditDataState, Continuation<? super InternalAssetTransferEquityEditDataState> continuation) {
            return ((C191701) create(internalAssetTransferEquityEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InternalAssetTransferEquityEditDataState internalAssetTransferEquityEditDataState = (InternalAssetTransferEquityEditDataState) this.L$0;
            ShareSelection2 shareSelection2 = this.$selectionType;
            int i = WhenMappings.$EnumSwitchMapping$0[shareSelection2.ordinal()];
            boolean z = true;
            if (i == 1) {
                z = false;
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return InternalAssetTransferEquityEditDataState.copy$default(internalAssetTransferEquityEditDataState, null, shareSelection2, null, z, 5, null);
        }
    }

    public final void onSelectionTypeTapped(ShareSelection2 selectionType) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        applyMutation(new C191701(selectionType, null));
    }

    public final void onConfirmClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferEquityEditDuxo.onConfirmClicked$lambda$1(this.f$0, (InternalAssetTransferEquityEditDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConfirmClicked$lambda$1(InternalAssetTransferEquityEditDuxo internalAssetTransferEquityEditDuxo, InternalAssetTransferEquityEditDataState it) {
        ShareSelection specificShares;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = WhenMappings.$EnumSwitchMapping$0[it.getSelectionType().ordinal()];
        if (i == 1) {
            specificShares = ShareSelection.AllShares.INSTANCE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal shareInputAsBigDecimal = it.getShareInputAsBigDecimal();
            if (shareInputAsBigDecimal != null) {
                specificShares = new ShareSelection.SpecificShares(shareInputAsBigDecimal);
            } else {
                throw new IllegalArgumentException("Expected a valid share input when clicking confirm");
            }
        }
        internalAssetTransferEquityEditDuxo.submit(new InternalAssetTransferEquityEditEvent.ShareSelectionMade(StringsKt.toUuid(((InternalAssetTransferEquityEditFragment.Args) INSTANCE.getArgs((HasSavedState) internalAssetTransferEquityEditDuxo)).getAsset().getInstrumentId()), specificShares));
        return Unit.INSTANCE;
    }

    /* compiled from: InternalAssetTransferEquityEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$updateUserCurrentlyEditing$1", m3645f = "InternalAssetTransferEquityEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$updateUserCurrentlyEditing$1 */
    static final class C191711 extends ContinuationImpl7 implements Function2<InternalAssetTransferEquityEditDataState, Continuation<? super InternalAssetTransferEquityEditDataState>, Object> {
        final /* synthetic */ boolean $isUserCurrentlyEditing;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191711(boolean z, Continuation<? super C191711> continuation) {
            super(2, continuation);
            this.$isUserCurrentlyEditing = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191711 c191711 = new C191711(this.$isUserCurrentlyEditing, continuation);
            c191711.L$0 = obj;
            return c191711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferEquityEditDataState internalAssetTransferEquityEditDataState, Continuation<? super InternalAssetTransferEquityEditDataState> continuation) {
            return ((C191711) create(internalAssetTransferEquityEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferEquityEditDataState.copy$default((InternalAssetTransferEquityEditDataState) this.L$0, null, null, null, this.$isUserCurrentlyEditing, 7, null);
        }
    }

    public final void updateUserCurrentlyEditing(boolean isUserCurrentlyEditing) {
        applyMutation(new C191711(isUserCurrentlyEditing, null));
    }

    /* compiled from: InternalAssetTransferEquityEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$onKeyEvent$1", m3645f = "InternalAssetTransferEquityEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$onKeyEvent$1 */
    static final class C191671 extends ContinuationImpl7 implements Function2<InternalAssetTransferEquityEditDataState, Continuation<? super InternalAssetTransferEquityEditDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C191671(Continuation<? super C191671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191671 c191671 = new C191671(continuation);
            c191671.L$0 = obj;
            return c191671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferEquityEditDataState internalAssetTransferEquityEditDataState, Continuation<? super InternalAssetTransferEquityEditDataState> continuation) {
            return ((C191671) create(internalAssetTransferEquityEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InternalAssetTransferEquityEditDataState internalAssetTransferEquityEditDataState = (InternalAssetTransferEquityEditDataState) this.L$0;
            if (internalAssetTransferEquityEditDataState.getShareInput().length() == 0) {
                return InternalAssetTransferEquityEditDataState.copy$default(internalAssetTransferEquityEditDataState, null, null, "0.", false, 11, null);
            }
            if (!kotlin.text.StringsKt.contains$default((CharSequence) internalAssetTransferEquityEditDataState.getShareInput(), (CharSequence) ".", false, 2, (Object) null)) {
                return InternalAssetTransferEquityEditDataState.copy$default(internalAssetTransferEquityEditDataState, null, null, internalAssetTransferEquityEditDataState.getShareInput() + ".", false, 11, null);
            }
            return InternalAssetTransferEquityEditDataState.copy$default(internalAssetTransferEquityEditDataState, null, null, internalAssetTransferEquityEditDataState.getShareInput(), false, 11, null);
        }
    }

    public final void onKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        if (KeyEvents2.isDotOrPeriod(keyEvent)) {
            applyMutation(new C191671(null));
        } else if (KeyEvents2.isDigit(keyEvent)) {
            applyMutation(new C191682(keyEvent, null));
        } else if (KeyEvents2.isDelete(keyEvent)) {
            applyMutation(new C191693(null));
        }
    }

    /* compiled from: InternalAssetTransferEquityEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$onKeyEvent$2", m3645f = "InternalAssetTransferEquityEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$onKeyEvent$2 */
    static final class C191682 extends ContinuationImpl7 implements Function2<InternalAssetTransferEquityEditDataState, Continuation<? super InternalAssetTransferEquityEditDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191682(KeyEvent keyEvent, Continuation<? super C191682> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191682 c191682 = new C191682(this.$keyEvent, continuation);
            c191682.L$0 = obj;
            return c191682;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferEquityEditDataState internalAssetTransferEquityEditDataState, Continuation<? super InternalAssetTransferEquityEditDataState> continuation) {
            return ((C191682) create(internalAssetTransferEquityEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InternalAssetTransferEquityEditDataState internalAssetTransferEquityEditDataState = (InternalAssetTransferEquityEditDataState) this.L$0;
            if (Intrinsics.areEqual(internalAssetTransferEquityEditDataState.getShareInput(), "0")) {
                if (this.$keyEvent.getNumber() == '0') {
                    return InternalAssetTransferEquityEditDataState.copy$default(internalAssetTransferEquityEditDataState, null, null, internalAssetTransferEquityEditDataState.getShareInput(), false, 11, null);
                }
                return InternalAssetTransferEquityEditDataState.copy$default(internalAssetTransferEquityEditDataState, null, null, String.valueOf(this.$keyEvent.getNumber()), false, 11, null);
            }
            if (((CharSequence) CollectionsKt.last(kotlin.text.StringsKt.split$default((CharSequence) internalAssetTransferEquityEditDataState.getShareInput(), new String[]{"."}, false, 0, 6, (Object) null))).length() >= 6) {
                return InternalAssetTransferEquityEditDataState.copy$default(internalAssetTransferEquityEditDataState, null, null, internalAssetTransferEquityEditDataState.getShareInput(), false, 11, null);
            }
            return InternalAssetTransferEquityEditDataState.copy$default(internalAssetTransferEquityEditDataState, null, null, internalAssetTransferEquityEditDataState.getShareInput() + this.$keyEvent.getNumber(), false, 11, null);
        }
    }

    /* compiled from: InternalAssetTransferEquityEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$onKeyEvent$3", m3645f = "InternalAssetTransferEquityEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditDuxo$onKeyEvent$3 */
    static final class C191693 extends ContinuationImpl7 implements Function2<InternalAssetTransferEquityEditDataState, Continuation<? super InternalAssetTransferEquityEditDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C191693(Continuation<? super C191693> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191693 c191693 = new C191693(continuation);
            c191693.L$0 = obj;
            return c191693;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferEquityEditDataState internalAssetTransferEquityEditDataState, Continuation<? super InternalAssetTransferEquityEditDataState> continuation) {
            return ((C191693) create(internalAssetTransferEquityEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InternalAssetTransferEquityEditDataState internalAssetTransferEquityEditDataState = (InternalAssetTransferEquityEditDataState) this.L$0;
            return InternalAssetTransferEquityEditDataState.copy$default(internalAssetTransferEquityEditDataState, null, null, kotlin.text.StringsKt.dropLast(internalAssetTransferEquityEditDataState.getShareInput(), 1), false, 11, null);
        }
    }

    /* compiled from: InternalAssetTransferEquityEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditDuxo;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InternalAssetTransferEquityEditDuxo, InternalAssetTransferEquityEditFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferEquityEditFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (InternalAssetTransferEquityEditFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferEquityEditFragment.Args getArgs(InternalAssetTransferEquityEditDuxo internalAssetTransferEquityEditDuxo) {
            return (InternalAssetTransferEquityEditFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, internalAssetTransferEquityEditDuxo);
        }
    }
}
