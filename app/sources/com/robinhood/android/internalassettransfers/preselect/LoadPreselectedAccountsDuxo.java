package com.robinhood.android.internalassettransfers.preselect;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.internalassettransfers.accountselection.UiEligibleAccounts;
import com.robinhood.android.internalassettransfers.accountselection.UiEligibleAccounts2;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsEvent;
import com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsFragment;
import com.robinhood.android.internalassettransfers.review.models.UiAssets3;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.internalassettransfers.data.store.InternalAssetTransfersStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.logging.CrashReporter;
import internal_asset_transfers.proto.p475v1.GetEligibleAccountsRequestDto;
import internal_asset_transfers.proto.p475v1.GetEligibleAccountsResponseDto;
import internal_asset_transfers.proto.p475v1.InternalAssetTransfersService;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import p479j$.time.Clock;

/* compiled from: LoadPreselectedAccountsDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsViewState;", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "internalAssetTransfersStore", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onStart", "()V", "Lcom/robinhood/internalassettransfers/data/store/InternalAssetTransfersStore;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lmicrogram/android/inject/MicrogramComponent;", "internalAssetTransfersMicrogramApp", "Lmicrogram/android/inject/MicrogramComponent;", "Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;", "internalAssetTransfersService", "Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LoadPreselectedAccountsDuxo extends BaseDuxo5<LoadPreselectedAccountsViewState, LoadPreselectedAccountsEvent> implements HasSavedState {
    private final Clock clock;
    private final MicrogramComponent internalAssetTransfersMicrogramApp;
    private final InternalAssetTransfersService internalAssetTransfersService;
    private final InternalAssetTransfersStore internalAssetTransfersStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadPreselectedAccountsDuxo(InternalAssetTransfersStore internalAssetTransfersStore, Clock clock, SavedStateHandle savedStateHandle, MicrogramComponent.Factory microgramComponentFactory, DuxoBundle duxoBundle) {
        super(new LoadPreselectedAccountsViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(internalAssetTransfersStore, "internalAssetTransfersStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.internalAssetTransfersStore = internalAssetTransfersStore;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent microgramComponentCreate$default = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-internal-asset-transfers", null, 2, null), null, 4, null);
        this.internalAssetTransfersMicrogramApp = microgramComponentCreate$default;
        this.internalAssetTransfersService = (InternalAssetTransfersService) microgramComponentCreate$default.getServiceLocator().getClient(InternalAssetTransfersService.class);
    }

    /* compiled from: LoadPreselectedAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsDuxo$onStart$1", m3645f = "LoadPreselectedAccountsDuxo.kt", m3646l = {46, 59}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.preselect.LoadPreselectedAccountsDuxo$onStart$1 */
    static final class C192311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C192311(Continuation<? super C192311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoadPreselectedAccountsDuxo.this.new C192311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C192311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:46:0x00f7, B:48:0x0103, B:49:0x010e, B:13:0x0029, B:19:0x0045, B:20:0x005d, B:22:0x0063, B:26:0x0082, B:28:0x009f, B:29:0x00a7, B:31:0x00ad, B:35:0x00cc, B:37:0x00d0, B:42:0x00db, B:50:0x0116, B:16:0x0030), top: B:55:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x010e A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:46:0x00f7, B:48:0x0103, B:49:0x010e, B:13:0x0029, B:19:0x0045, B:20:0x005d, B:22:0x0063, B:26:0x0082, B:28:0x009f, B:29:0x00a7, B:31:0x00ad, B:35:0x00cc, B:37:0x00d0, B:42:0x00db, B:50:0x0116, B:16:0x0030), top: B:55:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object next;
            UiIatAccount uiIatAccount;
            UiIatAccount uiIatAccount2;
            Object next2;
            EligibleAssets eligibleAssets;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            UiIatAccount uiIatAccount3 = null;
            try {
            } catch (Exception e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
                LoadPreselectedAccountsDuxo.this.submit(LoadPreselectedAccountsEvent.Incompatible.INSTANCE);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InternalAssetTransfersService internalAssetTransfersService = LoadPreselectedAccountsDuxo.this.internalAssetTransfersService;
                GetEligibleAccountsRequestDto getEligibleAccountsRequestDto = new GetEligibleAccountsRequestDto(null, 1, null);
                this.label = 1;
                obj = internalAssetTransfersService.GetEligibleAccounts(getEligibleAccountsRequestDto, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uiIatAccount2 = (UiIatAccount) this.L$1;
                uiIatAccount = (UiIatAccount) this.L$0;
                ResultKt.throwOnFailure(obj);
                eligibleAssets = (EligibleAssets) obj;
                if (UiAssets3.toTransferableUiModel(eligibleAssets).getAssetsCount() <= 0) {
                    LoadPreselectedAccountsDuxo.this.submit(new LoadPreselectedAccountsEvent.Compatible(uiIatAccount2, uiIatAccount, eligibleAssets));
                } else {
                    LoadPreselectedAccountsDuxo.this.submit(LoadPreselectedAccountsEvent.Incompatible.INSTANCE);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            UiEligibleAccounts uiModel = UiEligibleAccounts2.toUiModel((GetEligibleAccountsResponseDto) obj, LoadPreselectedAccountsDuxo.this.clock);
            List<UiIatAccount> accounts2 = uiModel.getAccounts();
            LoadPreselectedAccountsDuxo loadPreselectedAccountsDuxo = LoadPreselectedAccountsDuxo.this;
            Iterator<T> it = accounts2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((UiIatAccount) next).getRhsAccountNumber(), ((LoadPreselectedAccountsFragment.Args) LoadPreselectedAccountsDuxo.INSTANCE.getArgs((HasSavedState) loadPreselectedAccountsDuxo)).getSinkRhsAccountNumber())) {
                    break;
                }
            }
            uiIatAccount = (UiIatAccount) next;
            List<UiIatAccount> list = uiModel.getValidSinkToSource().get(((LoadPreselectedAccountsFragment.Args) LoadPreselectedAccountsDuxo.INSTANCE.getArgs((HasSavedState) LoadPreselectedAccountsDuxo.this)).getSinkRhsAccountNumber());
            if (list != null) {
                LoadPreselectedAccountsDuxo loadPreselectedAccountsDuxo2 = LoadPreselectedAccountsDuxo.this;
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.areEqual(((UiIatAccount) next2).getRhsAccountNumber(), ((LoadPreselectedAccountsFragment.Args) LoadPreselectedAccountsDuxo.INSTANCE.getArgs((HasSavedState) loadPreselectedAccountsDuxo2)).getSourceRhsAccountNumber())) {
                        break;
                    }
                }
                UiIatAccount uiIatAccount4 = (UiIatAccount) next2;
                if (uiIatAccount4 != null && uiIatAccount4.isEligibleSource()) {
                    uiIatAccount3 = uiIatAccount4;
                }
            }
            if (uiIatAccount != null && uiIatAccount3 != null) {
                InternalAssetTransfersStore internalAssetTransfersStore = LoadPreselectedAccountsDuxo.this.internalAssetTransfersStore;
                String rhsAccountNumber = uiIatAccount3.getRhsAccountNumber();
                String rhsAccountNumber2 = uiIatAccount.getRhsAccountNumber();
                this.L$0 = uiIatAccount;
                this.L$1 = uiIatAccount3;
                this.label = 2;
                obj = internalAssetTransfersStore.getEligibleAssets(rhsAccountNumber, rhsAccountNumber2, this);
                if (obj != coroutine_suspended) {
                    uiIatAccount2 = uiIatAccount3;
                    eligibleAssets = (EligibleAssets) obj;
                    if (UiAssets3.toTransferableUiModel(eligibleAssets).getAssetsCount() <= 0) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            LoadPreselectedAccountsDuxo.this.submit(LoadPreselectedAccountsEvent.Incompatible.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C192311(null));
    }

    /* compiled from: LoadPreselectedAccountsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsDuxo;", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<LoadPreselectedAccountsDuxo, LoadPreselectedAccountsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LoadPreselectedAccountsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (LoadPreselectedAccountsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LoadPreselectedAccountsFragment.Args getArgs(LoadPreselectedAccountsDuxo loadPreselectedAccountsDuxo) {
            return (LoadPreselectedAccountsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, loadPreselectedAccountsDuxo);
        }
    }
}
