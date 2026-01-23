package com.robinhood.android.debitcard.linking.p098ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AutoLoggableDebitCardLinkingFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/AutoLoggableDebitCardLinkingFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "layoutRes", "", "<init>", "(I)V", "protoScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getProtoScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "loggingContext$delegate", "paymentLinkingContextOverride", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;", "getPaymentLinkingContextOverride", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "screenEventData$delegate", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class AutoLoggableDebitCardLinkingFragment extends BaseFragment implements AutoLoggableFragment {
    public static final int $stable = 8;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen;

    /* renamed from: loggingContext$delegate, reason: from kotlin metadata */
    private final Lazy loggingContext;
    private final PaymentLinkingContext paymentLinkingContextOverride;

    /* renamed from: screenEventData$delegate, reason: from kotlin metadata */
    private final Lazy screenEventData;

    public abstract Screen.Name getProtoScreenName();

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    public AutoLoggableDebitCardLinkingFragment(int i) {
        super(i);
        this.eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.AutoLoggableDebitCardLinkingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoLoggableDebitCardLinkingFragment.eventScreen_delegate$lambda$0(this.f$0);
            }
        });
        this.loggingContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.AutoLoggableDebitCardLinkingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoLoggableDebitCardLinkingFragment.loggingContext_delegate$lambda$3(this.f$0);
            }
        });
        this.screenEventData = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.AutoLoggableDebitCardLinkingFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoLoggableDebitCardLinkingFragment.screenEventData_delegate$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0(AutoLoggableDebitCardLinkingFragment autoLoggableDebitCardLinkingFragment) {
        return new Screen(autoLoggableDebitCardLinkingFragment.getProtoScreenName(), null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    public final Context getLoggingContext() {
        return (Context) this.loggingContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Context loggingContext_delegate$lambda$3(AutoLoggableDebitCardLinkingFragment autoLoggableDebitCardLinkingFragment) {
        PaymentLinkingContext paymentLinkingContext;
        PaymentLinkingContext paymentLinkingContextM1926x8fa74b8b;
        Context context;
        Fragment parentFragment = autoLoggableDebitCardLinkingFragment.getParentFragment();
        AutoLoggableDebitCardLinkingFragment autoLoggableDebitCardLinkingFragment2 = parentFragment instanceof AutoLoggableDebitCardLinkingFragment ? (AutoLoggableDebitCardLinkingFragment) parentFragment : null;
        if (autoLoggableDebitCardLinkingFragment.getPaymentLinkingContextOverride() != null) {
            paymentLinkingContextM1926x8fa74b8b = autoLoggableDebitCardLinkingFragment.getPaymentLinkingContextOverride();
        } else {
            if ((autoLoggableDebitCardLinkingFragment2 != null ? autoLoggableDebitCardLinkingFragment2.getPaymentLinkingContextOverride() : null) != null) {
                paymentLinkingContextM1926x8fa74b8b = autoLoggableDebitCardLinkingFragment2.getPaymentLinkingContextOverride();
            } else {
                FragmentActivity fragmentActivityRequireActivity = autoLoggableDebitCardLinkingFragment.requireActivity();
                DebitCardLinkingActivity debitCardLinkingActivity = fragmentActivityRequireActivity instanceof DebitCardLinkingActivity ? (DebitCardLinkingActivity) fragmentActivityRequireActivity : null;
                if (debitCardLinkingActivity == null) {
                    paymentLinkingContext = null;
                    context = paymentLinkingContext != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, paymentLinkingContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -32769, -1, -1, -1, 16383, null) : null;
                    if (context == null) {
                        return context;
                    }
                    throw new IllegalStateException("PaymentLinkingContext must be set! \nPlease look to check relevant fragments and Activities to see if this field is set.");
                }
                paymentLinkingContextM1926x8fa74b8b = debitCardLinkingActivity.m1926x8fa74b8b();
            }
        }
        paymentLinkingContext = paymentLinkingContextM1926x8fa74b8b;
        if (paymentLinkingContext != null) {
        }
        if (context == null) {
        }
    }

    public PaymentLinkingContext getPaymentLinkingContextOverride() {
        return this.paymentLinkingContextOverride;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return (UserInteractionEventData) this.screenEventData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData screenEventData_delegate$lambda$4(AutoLoggableDebitCardLinkingFragment autoLoggableDebitCardLinkingFragment) {
        return new UserInteractionEventData(null, autoLoggableDebitCardLinkingFragment.getEventScreen(), null, null, autoLoggableDebitCardLinkingFragment.getLoggingContext(), null, null, 109, null);
    }
}
