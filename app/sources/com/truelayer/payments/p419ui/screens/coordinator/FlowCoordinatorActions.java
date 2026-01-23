package com.truelayer.payments.p419ui.screens.coordinator;

import android.content.Context;
import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.UserAccount;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlowCoordinatorActions.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0091\u0003\u0012#\b\u0002\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r\u0012#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\u0003\u0012#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u0003\u0012/\b\u0002\u0010\u0014\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\b0\u0003\u00128\b\u0002\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\b0\u0019\u0012#\b\u0002\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u0003\u0012#\b\u0002\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010'J$\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u0015\u00108\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u0015\u00109\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J$\u0010:\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u0015\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u0015\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0\rHÆ\u0003J$\u0010>\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J$\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J0\u0010@\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010A\u001a2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\b0\u0019HÆ\u0003J$\u0010B\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u0095\u0003\u0010C\u001a\u00020\u00002#\b\u0002\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r2#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\u00032#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u00032/\b\u0002\u0010\u0014\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\b0\u000328\b\u0002\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\b0\u00192#\b\u0002\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\b0\u00032\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u00032\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u00032#\b\u0002\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010D\u001a\u00020\u00042\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0016HÖ\u0001R,\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R,\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R,\u0010$\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)RA\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R,\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R8\u0010\u0014\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)¨\u0006I"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/FlowCoordinatorActions;", "", "onInit", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "force", "", "onUserAccountSelect", "Lcom/truelayer/payments/core/domain/payments/UserAccount;", "onUserAccountDelete", "onUseNewAccount", "Lkotlin/Function0;", "onSelectProvider", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "providerSelectionResult", "onError", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "error", "onSubmitForm", "", "", "additionalInfo", "onRedirect", "Lkotlin/Function2;", "redirectUrl", "Landroid/content/Context;", "context", "onAbort", "Lcom/truelayer/payments/ui/screens/coordinator/PaymentCancellationReason;", "reason", "onSuccess", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Successful;", "onFailure", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "onNotifyPaymentStateChanged", "Lcom/truelayer/payments/core/domain/payments/Payment;", Card.Icon.PAYMENT, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnAbort", "()Lkotlin/jvm/functions/Function1;", "getOnError", "getOnFailure", "getOnInit", "getOnNotifyPaymentStateChanged", "getOnRedirect", "()Lkotlin/jvm/functions/Function2;", "getOnSelectProvider", "getOnSubmitForm", "getOnSuccess", "getOnUseNewAccount", "()Lkotlin/jvm/functions/Function0;", "getOnUserAccountDelete", "getOnUserAccountSelect", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FlowCoordinatorActions {
    public static final int $stable = 0;
    private final Function1<PaymentCancellationReason, Unit> onAbort;
    private final Function1<CoreError, Unit> onError;
    private final Function1<ProcessorResult.Failure, Unit> onFailure;
    private final Function1<Boolean, Unit> onInit;
    private final Function1<Payment, Unit> onNotifyPaymentStateChanged;
    private final Function2<String, Context, Unit> onRedirect;
    private final Function1<ProviderSelectionResult, Unit> onSelectProvider;
    private final Function1<Map<String, String>, Unit> onSubmitForm;
    private final Function1<ProcessorResult.Successful, Unit> onSuccess;
    private final Function0<Unit> onUseNewAccount;
    private final Function1<UserAccount, Unit> onUserAccountDelete;
    private final Function1<UserAccount, Unit> onUserAccountSelect;

    public FlowCoordinatorActions() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ FlowCoordinatorActions copy$default(FlowCoordinatorActions flowCoordinatorActions, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function1 function15, Function1 function16, Function2 function2, Function1 function17, Function1 function18, Function1 function19, Function1 function110, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = flowCoordinatorActions.onInit;
        }
        if ((i & 2) != 0) {
            function12 = flowCoordinatorActions.onUserAccountSelect;
        }
        if ((i & 4) != 0) {
            function13 = flowCoordinatorActions.onUserAccountDelete;
        }
        if ((i & 8) != 0) {
            function0 = flowCoordinatorActions.onUseNewAccount;
        }
        if ((i & 16) != 0) {
            function14 = flowCoordinatorActions.onSelectProvider;
        }
        if ((i & 32) != 0) {
            function15 = flowCoordinatorActions.onError;
        }
        if ((i & 64) != 0) {
            function16 = flowCoordinatorActions.onSubmitForm;
        }
        if ((i & 128) != 0) {
            function2 = flowCoordinatorActions.onRedirect;
        }
        if ((i & 256) != 0) {
            function17 = flowCoordinatorActions.onAbort;
        }
        if ((i & 512) != 0) {
            function18 = flowCoordinatorActions.onSuccess;
        }
        if ((i & 1024) != 0) {
            function19 = flowCoordinatorActions.onFailure;
        }
        if ((i & 2048) != 0) {
            function110 = flowCoordinatorActions.onNotifyPaymentStateChanged;
        }
        Function1 function111 = function19;
        Function1 function112 = function110;
        Function1 function113 = function17;
        Function1 function114 = function18;
        Function1 function115 = function16;
        Function2 function22 = function2;
        Function1 function116 = function14;
        Function1 function117 = function15;
        return flowCoordinatorActions.copy(function1, function12, function13, function0, function116, function117, function115, function22, function113, function114, function111, function112);
    }

    public final Function1<Boolean, Unit> component1() {
        return this.onInit;
    }

    public final Function1<ProcessorResult.Successful, Unit> component10() {
        return this.onSuccess;
    }

    public final Function1<ProcessorResult.Failure, Unit> component11() {
        return this.onFailure;
    }

    public final Function1<Payment, Unit> component12() {
        return this.onNotifyPaymentStateChanged;
    }

    public final Function1<UserAccount, Unit> component2() {
        return this.onUserAccountSelect;
    }

    public final Function1<UserAccount, Unit> component3() {
        return this.onUserAccountDelete;
    }

    public final Function0<Unit> component4() {
        return this.onUseNewAccount;
    }

    public final Function1<ProviderSelectionResult, Unit> component5() {
        return this.onSelectProvider;
    }

    public final Function1<CoreError, Unit> component6() {
        return this.onError;
    }

    public final Function1<Map<String, String>, Unit> component7() {
        return this.onSubmitForm;
    }

    public final Function2<String, Context, Unit> component8() {
        return this.onRedirect;
    }

    public final Function1<PaymentCancellationReason, Unit> component9() {
        return this.onAbort;
    }

    public final FlowCoordinatorActions copy(Function1<? super Boolean, Unit> onInit, Function1<? super UserAccount, Unit> onUserAccountSelect, Function1<? super UserAccount, Unit> onUserAccountDelete, Function0<Unit> onUseNewAccount, Function1<? super ProviderSelectionResult, Unit> onSelectProvider, Function1<? super CoreError, Unit> onError, Function1<? super Map<String, String>, Unit> onSubmitForm, Function2<? super String, ? super Context, Unit> onRedirect, Function1<? super PaymentCancellationReason, Unit> onAbort, Function1<? super ProcessorResult.Successful, Unit> onSuccess, Function1<? super ProcessorResult.Failure, Unit> onFailure, Function1<? super Payment, Unit> onNotifyPaymentStateChanged) {
        Intrinsics.checkNotNullParameter(onInit, "onInit");
        Intrinsics.checkNotNullParameter(onUserAccountSelect, "onUserAccountSelect");
        Intrinsics.checkNotNullParameter(onUserAccountDelete, "onUserAccountDelete");
        Intrinsics.checkNotNullParameter(onUseNewAccount, "onUseNewAccount");
        Intrinsics.checkNotNullParameter(onSelectProvider, "onSelectProvider");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSubmitForm, "onSubmitForm");
        Intrinsics.checkNotNullParameter(onRedirect, "onRedirect");
        Intrinsics.checkNotNullParameter(onAbort, "onAbort");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Intrinsics.checkNotNullParameter(onNotifyPaymentStateChanged, "onNotifyPaymentStateChanged");
        return new FlowCoordinatorActions(onInit, onUserAccountSelect, onUserAccountDelete, onUseNewAccount, onSelectProvider, onError, onSubmitForm, onRedirect, onAbort, onSuccess, onFailure, onNotifyPaymentStateChanged);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowCoordinatorActions)) {
            return false;
        }
        FlowCoordinatorActions flowCoordinatorActions = (FlowCoordinatorActions) other;
        return Intrinsics.areEqual(this.onInit, flowCoordinatorActions.onInit) && Intrinsics.areEqual(this.onUserAccountSelect, flowCoordinatorActions.onUserAccountSelect) && Intrinsics.areEqual(this.onUserAccountDelete, flowCoordinatorActions.onUserAccountDelete) && Intrinsics.areEqual(this.onUseNewAccount, flowCoordinatorActions.onUseNewAccount) && Intrinsics.areEqual(this.onSelectProvider, flowCoordinatorActions.onSelectProvider) && Intrinsics.areEqual(this.onError, flowCoordinatorActions.onError) && Intrinsics.areEqual(this.onSubmitForm, flowCoordinatorActions.onSubmitForm) && Intrinsics.areEqual(this.onRedirect, flowCoordinatorActions.onRedirect) && Intrinsics.areEqual(this.onAbort, flowCoordinatorActions.onAbort) && Intrinsics.areEqual(this.onSuccess, flowCoordinatorActions.onSuccess) && Intrinsics.areEqual(this.onFailure, flowCoordinatorActions.onFailure) && Intrinsics.areEqual(this.onNotifyPaymentStateChanged, flowCoordinatorActions.onNotifyPaymentStateChanged);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.onInit.hashCode() * 31) + this.onUserAccountSelect.hashCode()) * 31) + this.onUserAccountDelete.hashCode()) * 31) + this.onUseNewAccount.hashCode()) * 31) + this.onSelectProvider.hashCode()) * 31) + this.onError.hashCode()) * 31) + this.onSubmitForm.hashCode()) * 31) + this.onRedirect.hashCode()) * 31) + this.onAbort.hashCode()) * 31) + this.onSuccess.hashCode()) * 31) + this.onFailure.hashCode()) * 31) + this.onNotifyPaymentStateChanged.hashCode();
    }

    public String toString() {
        return "FlowCoordinatorActions(onInit=" + this.onInit + ", onUserAccountSelect=" + this.onUserAccountSelect + ", onUserAccountDelete=" + this.onUserAccountDelete + ", onUseNewAccount=" + this.onUseNewAccount + ", onSelectProvider=" + this.onSelectProvider + ", onError=" + this.onError + ", onSubmitForm=" + this.onSubmitForm + ", onRedirect=" + this.onRedirect + ", onAbort=" + this.onAbort + ", onSuccess=" + this.onSuccess + ", onFailure=" + this.onFailure + ", onNotifyPaymentStateChanged=" + this.onNotifyPaymentStateChanged + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowCoordinatorActions(Function1<? super Boolean, Unit> onInit, Function1<? super UserAccount, Unit> onUserAccountSelect, Function1<? super UserAccount, Unit> onUserAccountDelete, Function0<Unit> onUseNewAccount, Function1<? super ProviderSelectionResult, Unit> onSelectProvider, Function1<? super CoreError, Unit> onError, Function1<? super Map<String, String>, Unit> onSubmitForm, Function2<? super String, ? super Context, Unit> onRedirect, Function1<? super PaymentCancellationReason, Unit> onAbort, Function1<? super ProcessorResult.Successful, Unit> onSuccess, Function1<? super ProcessorResult.Failure, Unit> onFailure, Function1<? super Payment, Unit> onNotifyPaymentStateChanged) {
        Intrinsics.checkNotNullParameter(onInit, "onInit");
        Intrinsics.checkNotNullParameter(onUserAccountSelect, "onUserAccountSelect");
        Intrinsics.checkNotNullParameter(onUserAccountDelete, "onUserAccountDelete");
        Intrinsics.checkNotNullParameter(onUseNewAccount, "onUseNewAccount");
        Intrinsics.checkNotNullParameter(onSelectProvider, "onSelectProvider");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSubmitForm, "onSubmitForm");
        Intrinsics.checkNotNullParameter(onRedirect, "onRedirect");
        Intrinsics.checkNotNullParameter(onAbort, "onAbort");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Intrinsics.checkNotNullParameter(onNotifyPaymentStateChanged, "onNotifyPaymentStateChanged");
        this.onInit = onInit;
        this.onUserAccountSelect = onUserAccountSelect;
        this.onUserAccountDelete = onUserAccountDelete;
        this.onUseNewAccount = onUseNewAccount;
        this.onSelectProvider = onSelectProvider;
        this.onError = onError;
        this.onSubmitForm = onSubmitForm;
        this.onRedirect = onRedirect;
        this.onAbort = onAbort;
        this.onSuccess = onSuccess;
        this.onFailure = onFailure;
        this.onNotifyPaymentStateChanged = onNotifyPaymentStateChanged;
    }

    public /* synthetic */ FlowCoordinatorActions(Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function1 function15, Function1 function16, Function2 function2, Function1 function17, Function1 function18, Function1 function19, Function1 function110, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1<Boolean, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.1
            public final void invoke(boolean z) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }
        } : function1, (i & 2) != 0 ? new Function1<UserAccount, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserAccount it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserAccount userAccount) {
                invoke2(userAccount);
                return Unit.INSTANCE;
            }
        } : function12, (i & 4) != 0 ? new Function1<UserAccount, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserAccount it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserAccount userAccount) {
                invoke2(userAccount);
                return Unit.INSTANCE;
            }
        } : function13, (i & 8) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.4
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0, (i & 16) != 0 ? new Function1<ProviderSelectionResult, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.5
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ProviderSelectionResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ProviderSelectionResult providerSelectionResult) {
                invoke2(providerSelectionResult);
                return Unit.INSTANCE;
            }
        } : function14, (i & 32) != 0 ? new Function1<CoreError, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.6
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CoreError it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CoreError coreError) {
                invoke2(coreError);
                return Unit.INSTANCE;
            }
        } : function15, (i & 64) != 0 ? new Function1<Map<String, ? extends String>, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.7
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Map<String, String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
                invoke2((Map<String, String>) map);
                return Unit.INSTANCE;
            }
        } : function16, (i & 128) != 0 ? new Function2<String, Context, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.8
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str, Context context) {
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(context, "<anonymous parameter 1>");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Context context) {
                invoke2(str, context);
                return Unit.INSTANCE;
            }
        } : function2, (i & 256) != 0 ? new Function1<PaymentCancellationReason, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.9
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PaymentCancellationReason it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaymentCancellationReason paymentCancellationReason) {
                invoke2(paymentCancellationReason);
                return Unit.INSTANCE;
            }
        } : function17, (i & 512) != 0 ? new Function1<ProcessorResult.Successful, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.10
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ProcessorResult.Successful it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult.Successful successful) {
                invoke2(successful);
                return Unit.INSTANCE;
            }
        } : function18, (i & 1024) != 0 ? new Function1<ProcessorResult.Failure, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.11
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ProcessorResult.Failure it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ProcessorResult.Failure failure) {
                invoke2(failure);
                return Unit.INSTANCE;
            }
        } : function19, (i & 2048) != 0 ? new Function1<Payment, Unit>() { // from class: com.truelayer.payments.ui.screens.coordinator.FlowCoordinatorActions.12
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Payment it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Payment payment) {
                invoke2(payment);
                return Unit.INSTANCE;
            }
        } : function110);
    }

    public final Function1<Boolean, Unit> getOnInit() {
        return this.onInit;
    }

    public final Function1<UserAccount, Unit> getOnUserAccountSelect() {
        return this.onUserAccountSelect;
    }

    public final Function1<UserAccount, Unit> getOnUserAccountDelete() {
        return this.onUserAccountDelete;
    }

    public final Function0<Unit> getOnUseNewAccount() {
        return this.onUseNewAccount;
    }

    public final Function1<ProviderSelectionResult, Unit> getOnSelectProvider() {
        return this.onSelectProvider;
    }

    public final Function1<CoreError, Unit> getOnError() {
        return this.onError;
    }

    public final Function1<Map<String, String>, Unit> getOnSubmitForm() {
        return this.onSubmitForm;
    }

    public final Function2<String, Context, Unit> getOnRedirect() {
        return this.onRedirect;
    }

    public final Function1<PaymentCancellationReason, Unit> getOnAbort() {
        return this.onAbort;
    }

    public final Function1<ProcessorResult.Successful, Unit> getOnSuccess() {
        return this.onSuccess;
    }

    public final Function1<ProcessorResult.Failure, Unit> getOnFailure() {
        return this.onFailure;
    }

    public final Function1<Payment, Unit> getOnNotifyPaymentStateChanged() {
        return this.onNotifyPaymentStateChanged;
    }
}
