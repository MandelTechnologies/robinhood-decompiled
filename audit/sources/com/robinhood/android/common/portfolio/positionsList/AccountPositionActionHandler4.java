package com.robinhood.android.common.portfolio.positionsList;

import android.content.Context;
import android.net.Uri;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.SnapshotState;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.portfolio.util.AssetHomeAccountTypeKtx;
import com.robinhood.android.common.portfolio.util.AssetHomeAssetTypeKtx;
import com.robinhood.android.equities.contracts.AssetHomeContract;
import com.robinhood.android.eventcontracts.contracts.HubNavigateUtils2;
import com.robinhood.android.futures.contracts.FuturesAssetHomeFragmentKey;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.portfolio.contracts.PositionsSortOptionsKey;
import com.robinhood.android.portfolio.contracts.PositionsSortOptionsKey2;
import com.robinhood.android.portfolio.contracts.PositionsSortResult;
import com.robinhood.android.retirement.contracts.RetirementUninvestedModal;
import com.robinhood.models.serverdriven.experimental.api.AccountPositionAction;
import com.robinhood.models.serverdriven.experimental.api.AssetHomeAssetType;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountPositionActionHandler.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$handler$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AccountPositionActionHandler4<ActionT> implements SduiActionHandler {
    final /* synthetic */ boolean $allowSortOptionsSelection;
    final /* synthetic */ SnapshotState<GenericAlertContent<AccountPositionAction>> $bottomSheetContent$delegate;
    final /* synthetic */ SheetState $bottomSheetState;
    final /* synthetic */ Context $context;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ SnapshotState<GenericAlertContent<AccountPositionAction>> $dialogContent$delegate;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function1<AssetHomeAssetType, Unit> $onAssetHomeOpened;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function0<Unit> $onSortOptionsFragmentShown;
    final /* synthetic */ PositionsLocation $positionsLocation;
    final /* synthetic */ Screen $screen;

    /* compiled from: AccountPositionActionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$handler$1$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AssetHomeAssetType.values().length];
            try {
                iArr[AssetHomeAssetType.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetHomeAssetType.FUTURES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetHomeAssetType.PREDICTION_MARKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GenericAlertMobilePresentationStyle.values().length];
            try {
                iArr2[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    AccountPositionActionHandler4(Function1<? super AssetHomeAssetType, Unit> function1, Navigator navigator, Context context, Screen screen, CoroutineScope coroutineScope, boolean z, FragmentManager fragmentManager, PositionsLocation positionsLocation, Function0<Unit> function0, Function0<Unit> function02, SheetState sheetState, SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState, SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState2) {
        this.$onAssetHomeOpened = function1;
        this.$navigator = navigator;
        this.$context = context;
        this.$screen = screen;
        this.$coroutineScope = coroutineScope;
        this.$allowSortOptionsSelection = z;
        this.$fragmentManager = fragmentManager;
        this.$positionsLocation = positionsLocation;
        this.$onDismiss = function0;
        this.$onSortOptionsFragmentShown = function02;
        this.$bottomSheetState = sheetState;
        this.$bottomSheetContent$delegate = snapshotState;
        this.$dialogContent$delegate = snapshotState2;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
    public final boolean mo15941handle(AccountPositionAction action) {
        FragmentManager fragmentManager;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AccountPositionAction.PresentAssetHome) {
            Function1<AssetHomeAssetType, Unit> function1 = this.$onAssetHomeOpened;
            if (function1 != null) {
                function1.invoke(((AccountPositionAction.PresentAssetHome) action).getValue2().getAsset_type());
            }
            AccountPositionAction.PresentAssetHome presentAssetHome = (AccountPositionAction.PresentAssetHome) action;
            int i = WhenMappings.$EnumSwitchMapping$0[presentAssetHome.getValue2().getAsset_type().ordinal()];
            if (i == 1) {
                Navigator.DefaultImpls.startActivity$default(this.$navigator, this.$context, TabLinkIntentKey.Crypto.INSTANCE, null, false, null, null, 60, null);
            } else if (i == 2) {
                Navigator.DefaultImpls.showFragment$default(this.$navigator, this.$context, new FuturesAssetHomeFragmentKey(presentAssetHome.getValue2().getAccount_number(), this.$screen), false, false, false, null, false, null, false, false, null, null, 4092, null);
            } else if (i == 3) {
                BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass1(this.$navigator, this.$context, null), 3, null);
            } else {
                AssetHomeContract.AssetType assetHomeContractAssetType = AssetHomeAssetTypeKtx.toAssetHomeContractAssetType(presentAssetHome.getValue2().getAsset_type());
                if (assetHomeContractAssetType == null) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("PresentAssetHome with Unknown asset type, " + presentAssetHome.getValue2().getAsset_type()), false, null, 6, null);
                    return true;
                }
                Navigator.DefaultImpls.showFragment$default(this.$navigator, this.$context, new AssetHomeContract.Key(presentAssetHome.getValue2().getAccount_number(), AssetHomeAccountTypeKtx.toPortfolioAccountType(presentAssetHome.getValue2().getAccount_type()), assetHomeContractAssetType, this.$screen, (FragmentTab) null, 16, (DefaultConstructorMarker) null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            }
            return true;
        }
        if (action instanceof AccountPositionAction.PresentPositionsSort) {
            AccountPositionAction.PresentPositionsSort presentPositionsSort = (AccountPositionAction.PresentPositionsSort) action;
            PositionInstrumentType positionInstrumentTypeFromServerValue = PositionInstrumentType.INSTANCE.fromServerValue(presentPositionsSort.getValue2().getInstrument_type());
            if (this.$allowSortOptionsSelection && (fragmentManager = this.$fragmentManager) != null && positionInstrumentTypeFromServerValue != null) {
                Navigator navigator = this.$navigator;
                PositionsSortOptionsKey positionsSortOptionsKey = new PositionsSortOptionsKey(this.$screen, presentPositionsSort.getValue2().getAccount_number(), positionInstrumentTypeFromServerValue, this.$positionsLocation, null, null, true, 48, null);
                final Function0<Unit> function0 = this.$onSortOptionsFragmentShown;
                PositionsSortOptionsKey2.launchSortOptionsFragment(navigator, fragmentManager, positionsSortOptionsKey, AccountPositionActionHandler.PositionsSortOptionsDialogTag, new Function1() { // from class: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$handler$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountPositionActionHandler4.handle$lambda$0(function0, (PositionsSortResult) obj);
                    }
                });
                return true;
            }
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("onSortOptionClicked is not specified"), false, null, 6, null);
            return false;
        }
        if (action instanceof AccountPositionAction.Dismiss) {
            BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass3(this.$bottomSheetState, this.$bottomSheetContent$delegate, this.$dialogContent$delegate, null), 3, null);
            Function0<Unit> function02 = this.$onDismiss;
            if (function02 != null) {
                function02.invoke();
            }
            return true;
        }
        if (action instanceof AccountPositionAction.Deeplink) {
            return Navigator.DefaultImpls.handleDeepLink$default(this.$navigator, this.$context, Uri.parse(((AccountPositionAction.Deeplink) action).getValue2().getUri()), Boolean.FALSE, null, false, null, 56, null);
        }
        if (action instanceof AccountPositionAction.InfoAlert) {
            AccountPositionAction.InfoAlert infoAlert = (AccountPositionAction.InfoAlert) action;
            int i2 = WhenMappings.$EnumSwitchMapping$1[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
            if (i2 == 1) {
                AccountPositionActionHandler.AccountPositionActionHandler$lambda$2(this.$dialogContent$delegate, infoAlert.getValue2().getAlert());
                return true;
            }
            if (i2 == 2) {
                BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass4(action, this.$bottomSheetState, this.$bottomSheetContent$delegate, null), 3, null);
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(action instanceof AccountPositionAction.RetirementUninvestedModalAction)) {
            return false;
        }
        AccountPositionAction.RetirementUninvestedModalAction retirementUninvestedModalAction = (AccountPositionAction.RetirementUninvestedModalAction) action;
        DialogFragment dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(this.$navigator, new RetirementUninvestedModal(retirementUninvestedModalAction.getValue2(), this.$screen, retirementUninvestedModalAction.getValue2().getLogging_identifier()), null, 2, null);
        FragmentManager fragmentManager2 = this.$fragmentManager;
        Intrinsics.checkNotNull(fragmentManager2);
        dialogFragmentCreateDialogFragment$default.show(fragmentManager2, (String) null);
        return true;
    }

    /* compiled from: AccountPositionActionHandler.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$handler$1$1$1", m3645f = "AccountPositionActionHandler.kt", m3646l = {88}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$handler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Navigator $navigator;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Navigator navigator, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$navigator = navigator;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$navigator, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Navigator navigator = this.$navigator;
                Context context = this.$context;
                this.label = 1;
                if (HubNavigateUtils2.navigateToEcHub(navigator, context, "invest-tab-ec-hub-header-v2", true, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handle$lambda$0(Function0 function0, PositionsSortResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AccountPositionActionHandler.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$handler$1$1$3", m3645f = "AccountPositionActionHandler.kt", m3646l = {147}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$handler$1$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<GenericAlertContent<AccountPositionAction>> $bottomSheetContent$delegate;
        final /* synthetic */ SheetState $bottomSheetState;
        final /* synthetic */ SnapshotState<GenericAlertContent<AccountPositionAction>> $dialogContent$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(SheetState sheetState, SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState, SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$bottomSheetState = sheetState;
            this.$bottomSheetContent$delegate = snapshotState;
            this.$dialogContent$delegate = snapshotState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$bottomSheetState, this.$bottomSheetContent$delegate, this.$dialogContent$delegate, continuation);
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
                SheetState sheetState = this.$bottomSheetState;
                this.label = 1;
                if (sheetState.hide(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$bottomSheetContent$delegate.setValue(null);
            AccountPositionActionHandler.AccountPositionActionHandler$lambda$2(this.$dialogContent$delegate, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AccountPositionActionHandler.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$handler$1$1$4", m3645f = "AccountPositionActionHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$handler$1$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AccountPositionAction $action;
        final /* synthetic */ SnapshotState<GenericAlertContent<AccountPositionAction>> $bottomSheetContent$delegate;
        final /* synthetic */ SheetState $bottomSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AccountPositionAction accountPositionAction, SheetState sheetState, SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$action = accountPositionAction;
            this.$bottomSheetState = sheetState;
            this.$bottomSheetContent$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$action, this.$bottomSheetState, this.$bottomSheetContent$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.$bottomSheetContent$delegate.setValue(((AccountPositionAction.InfoAlert) this.$action).getValue2().getAlert());
                SheetState sheetState = this.$bottomSheetState;
                this.label = 1;
                if (sheetState.show(this) == coroutine_suspended) {
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
    }
}
