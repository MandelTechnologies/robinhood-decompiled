package com.robinhood.android.transfers.transferhub;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acats.contracts.AcatsIn;
import com.robinhood.android.ach.contracts.AchRelationshipDocumentRequestSource;
import com.robinhood.android.ach.contracts.AchRelationshipDocumentVerification;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.AchRelationshipDocumentVerificationAction;
import com.robinhood.android.transfers.TransfersHubFragment;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.transfers.contracts.Wires;
import com.robinhood.android.transfers.transferhub.TransferHubEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferHubFragmentExtensions.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a \u0010\n\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a \u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0002\u001a9\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"handleNavigationTransferHubEvent", "", "Lcom/robinhood/android/transfers/TransfersHubFragment;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/transferhub/TransferHubEvent;", "context", "Landroid/content/Context;", "isInGuidedTransfersExperiment", "", "onDocumentVerificationAction", "result", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/android/transfers/AchRelationshipDocumentVerificationAction;", "", "launchDocumentUpload", "documentRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "showDocumentRequestErrorDialog", "titleResId", "", "messageResId", "handleDepositWithdrawalNav", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "prefillTransferInfo", "Lcom/robinhood/android/transfers/transferhub/PrefillTransferInfo;", "isWithdrawal", "isInTransfersRedesignExperiment", "(Lcom/robinhood/android/transfers/TransfersHubFragment;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/android/transfers/transferhub/PrefillTransferInfo;Ljava/lang/Boolean;Z)V", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensionsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferHubFragmentExtensions {
    public static final void handleNavigationTransferHubEvent(final TransfersHubFragment transfersHubFragment, final Event<TransferHubEvent> event, final Context context, final boolean z) {
        EventConsumer<TransferHubEvent> eventConsumerInvoke;
        EventConsumer<TransferHubEvent> eventConsumerInvoke2;
        EventConsumer<TransferHubEvent> eventConsumerInvoke3;
        EventConsumer<TransferHubEvent> eventConsumerInvoke4;
        EventConsumer<TransferHubEvent> eventConsumerInvoke5;
        EventConsumer<TransferHubEvent> eventConsumerInvoke6;
        EventConsumer<TransferHubEvent> eventConsumerInvoke7;
        EventConsumer<TransferHubEvent> eventConsumerInvoke8;
        EventConsumer<TransferHubEvent> eventConsumerInvoke9;
        EventConsumer<TransferHubEvent> eventConsumerInvoke10;
        Intrinsics.checkNotNullParameter(transfersHubFragment, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(context, "context");
        if ((event.getData() instanceof TransferHubEvent.Intent) && (eventConsumerInvoke10 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke10.consume(event, new Function1() { // from class: com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensionsKt$handleNavigationTransferHubEvent$lambda$12$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19733invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19733invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    IntentKey intentKey = ((TransferHubEvent.Intent) event.getData()).getIntentKey();
                    Navigator navigator = transfersHubFragment.getNavigator();
                    Context contextRequireContext = transfersHubFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, intentKey, null, false, null, null, 60, null);
                }
            });
        }
        if ((event.getData() instanceof TransferHubEvent.NavigateToDeposits) && (eventConsumerInvoke9 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke9.consume(event, new Function1() { // from class: com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensionsKt$handleNavigationTransferHubEvent$lambda$12$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19735invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19735invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    TransferHubEvent.NavigateToDeposits navigateToDeposits = (TransferHubEvent.NavigateToDeposits) event.getData();
                    TransfersHubFragment transfersHubFragment2 = transfersHubFragment;
                    TransferHubFragmentExtensions.handleDepositWithdrawalNav(transfersHubFragment2, transfersHubFragment2.getNavigator(), navigateToDeposits.getPrefillInfo(), Boolean.FALSE, z);
                }
            });
        }
        if ((event.getData() instanceof TransferHubEvent.NavigateToWithdrawals) && (eventConsumerInvoke8 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke8.consume(event, new Function1() { // from class: com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensionsKt$handleNavigationTransferHubEvent$lambda$12$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19736invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19736invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    TransferHubEvent.NavigateToWithdrawals navigateToWithdrawals = (TransferHubEvent.NavigateToWithdrawals) event.getData();
                    TransferHubFragmentExtensions.handleDepositWithdrawalNav(transfersHubFragment, transfersHubFragment.getNavigator(), navigateToWithdrawals.getPrefillInfo(), Boolean.TRUE, z);
                }
            });
        }
        if ((event.getData() instanceof TransferHubEvent.RecurringDeposit) && (eventConsumerInvoke7 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke7.consume(event, new Function1() { // from class: com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensionsKt$handleNavigationTransferHubEvent$lambda$12$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19737invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19737invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    TransferHubEvent.RecurringDeposit recurringDeposit = (TransferHubEvent.RecurringDeposit) event.getData();
                    FragmentKey fragmentKey = recurringDeposit.getFragmentKey();
                    if (fragmentKey != null) {
                        Navigator navigator = transfersHubFragment.getNavigator();
                        Context contextRequireContext = transfersHubFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, fragmentKey, false, false, false, null, false, null, false, false, null, null, 4092, null);
                    }
                    IntentKey navigationKey = recurringDeposit.getNavigationKey();
                    if (navigationKey != null) {
                        Navigator.DefaultImpls.startActivity$default(transfersHubFragment.getNavigator(), context, navigationKey, null, false, null, null, 60, null);
                    }
                }
            });
        }
        if ((event.getData() instanceof TransferHubEvent.NavigateToAcatsIn) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensionsKt$handleNavigationTransferHubEvent$lambda$12$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19738invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19738invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator.DefaultImpls.startActivity$default(transfersHubFragment.getNavigator(), context, new AcatsIn("transfers", false, false, null, false, 30, null), null, false, null, null, 60, null);
                }
            });
        }
        if ((event.getData() instanceof TransferHubEvent.NavigateToMoneyMovement) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensionsKt$handleNavigationTransferHubEvent$lambda$12$$inlined$consumeIfType$6
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19739invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19739invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (z) {
                        Navigator.DefaultImpls.startActivity$default(transfersHubFragment.getNavigator(), context, new TransferV2(TransferDirectionV2.INTER_ENTITY, new TransferConfiguration.Standard(null, null, false, null, null, null, MAXTransferContext.EntryPoint.TRANSFER_HUB, null, false, false, null, null, false, 8127, null), null, 4, null), null, false, null, null, 60, null);
                    } else {
                        TransfersHubFragment transfersHubFragment2 = transfersHubFragment;
                        TransferHubFragmentExtensions.handleDepositWithdrawalNav$default(transfersHubFragment2, transfersHubFragment2.getNavigator(), null, null, false, 6, null);
                    }
                }
            });
        }
        if ((event.getData() instanceof TransferHubEvent.NavigateToWires) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensionsKt$handleNavigationTransferHubEvent$lambda$12$$inlined$consumeIfType$7
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19740invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19740invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator navigator = transfersHubFragment.getNavigator();
                    Context contextRequireContext = transfersHubFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Wires(WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED, WiresContext.EntryPoint.TRANSFERS_HUB), null, false, null, null, 60, null);
                }
            });
        }
        if ((event.getData() instanceof TransferHubEvent.NavigateToRetirementAccountTransfer) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensionsKt$handleNavigationTransferHubEvent$lambda$12$$inlined$consumeIfType$8
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19741invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19741invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator navigator = transfersHubFragment.getNavigator();
                    Context contextRequireContext = transfersHubFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse("robinhood://hood-week-2024-promo?source=transfer-hub"), null, null, false, null, 60, null);
                }
            });
        }
        if ((event.getData() instanceof TransferHubEvent.NavigateToDirectDeposits) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensionsKt$handleNavigationTransferHubEvent$lambda$12$$inlined$consumeIfType$9
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19742invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19742invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator.DefaultImpls.startActivity$default(transfersHubFragment.getNavigator(), context, new DirectDepositShimKey(false, false, false, false, false, false, false, true, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, false, null, null, 60, null);
                }
            });
        }
        if (!(event.getData() instanceof TransferHubEvent.AchRelationshipDocumentVerificationAction) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensionsKt$handleNavigationTransferHubEvent$lambda$12$$inlined$consumeIfType$10
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                m19734invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m19734invoke(Object it) throws Throwable {
                Intrinsics.checkNotNullParameter(it, "it");
                TransferHubFragmentExtensions.onDocumentVerificationAction(transfersHubFragment, ((TransferHubEvent.AchRelationshipDocumentVerificationAction) event.getData()).getActionOrError());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDocumentVerificationAction(TransfersHubFragment transfersHubFragment, Either<? extends AchRelationshipDocumentVerificationAction, ? extends Throwable> either) throws Throwable {
        transfersHubFragment.getLoadingComposeView().setVisibility(8);
        if (either instanceof Either.Left) {
            AchRelationshipDocumentVerificationAction achRelationshipDocumentVerificationAction = (AchRelationshipDocumentVerificationAction) ((Either.Left) either).getValue();
            if (achRelationshipDocumentVerificationAction instanceof AchRelationshipDocumentVerificationAction.NeedsUpload) {
                launchDocumentUpload(transfersHubFragment, ((AchRelationshipDocumentVerificationAction.NeedsUpload) achRelationshipDocumentVerificationAction).getDocumentRequest());
                return;
            } else if (achRelationshipDocumentVerificationAction instanceof AchRelationshipDocumentVerificationAction.AlreadyUploaded) {
                showDocumentRequestErrorDialog(transfersHubFragment, C9631R.string.ach_relationship_verification_prompt_error_uploaded_title, C9631R.string.ach_relationship_verification_prompt_error_uploaded_message);
                return;
            } else {
                if (!(achRelationshipDocumentVerificationAction instanceof AchRelationshipDocumentVerificationAction.ContactSupport)) {
                    throw new NoWhenBranchMatchedException();
                }
                showDocumentRequestErrorDialog(transfersHubFragment, C9631R.string.ach_relationship_verification_prompt_error_unknown_title, C9631R.string.ach_relationship_verification_prompt_error_unknown_message);
                return;
            }
        }
        if (!(either instanceof Either.Right)) {
            throw new NoWhenBranchMatchedException();
        }
        transfersHubFragment.getErrorHandler().invoke2((Throwable) ((Either.Right) either).getValue());
    }

    private static final void launchDocumentUpload(TransfersHubFragment transfersHubFragment, DocumentRequest documentRequest) {
        Navigator navigator = transfersHubFragment.getNavigator();
        Context contextRequireContext = transfersHubFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new AchRelationshipDocumentVerification(documentRequest, AchRelationshipDocumentRequestSource.MOVE_MONEY), null, false, null, null, 60, null);
    }

    private static final void showDocumentRequestErrorDialog(TransfersHubFragment transfersHubFragment, int i, int i2) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = transfersHubFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setId(C9631R.id.dialog_id_iav_document_verification_prompt_error).setTitle(i, new Object[0]).setMessage(i2, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
        FragmentManager parentFragmentManager = transfersHubFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "documentRequestError", false, 4, null);
    }

    static /* synthetic */ void handleDepositWithdrawalNav$default(TransfersHubFragment transfersHubFragment, Navigator navigator, TransferHubEvent2 transferHubEvent2, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            transferHubEvent2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        handleDepositWithdrawalNav(transfersHubFragment, navigator, transferHubEvent2, bool, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleDepositWithdrawalNav(TransfersHubFragment transfersHubFragment, Navigator navigator, TransferHubEvent2 transferHubEvent2, Boolean bool, boolean z) {
        IntentKey transfer;
        TransferDirectionV2 transferDirectionV2;
        TransferConfiguration.Standard standard = new TransferConfiguration.Standard(null, null, false, null, null, null, MAXTransferContext.EntryPoint.TRANSFER_HUB, null, false, false, null, null, false, 8127, null);
        if (!z && transferHubEvent2 != null && bool != null) {
            standard = TransferConfiguration.Standard.copy$default(standard, null, null, false, transferHubEvent2.getSourceType() != null ? new TransferConfiguration.TransferAccountSelection(null, false, transferHubEvent2.getSourceType(), 3, null) : null, transferHubEvent2.getSinkType() != null ? new TransferConfiguration.TransferAccountSelection(null, false, transferHubEvent2.getSinkType(), 3, null) : null, null, null, null, false, false, null, null, false, 8167, null);
        }
        TransferConfiguration.Standard standard2 = standard;
        Context contextRequireContext = transfersHubFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (z) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                transferDirectionV2 = TransferDirectionV2.WITHDRAW;
            } else {
                transferDirectionV2 = TransferDirectionV2.DEPOSIT;
            }
            transfer = new TransferV2(transferDirectionV2, standard2, null, 4, null);
        } else {
            transfer = new Transfer(standard2);
        }
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, transfer, null, false, null, null, 60, null);
    }
}
