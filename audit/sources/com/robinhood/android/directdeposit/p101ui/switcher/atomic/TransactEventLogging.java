package com.robinhood.android.directdeposit.p101ui.switcher.atomic;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.directdeposit.p101ui.switcher.atomic.TransactEvent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: TransactEventLogging.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0005H\u0000\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0005H\u0002\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\f\u001a\u00020\r*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"toUserInteractionEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Close;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction;", "createUserInteractionEvent", "payrollProvider", "", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$Payload;", "getPayrollProvider", "(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$Payload;)Ljava/lang/String;", "distributionAmount", "", "getDistributionAmount", "(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$Payload;)D", "distributionType", "Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;", "getDistributionType", "(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$Payload;)Lcom/robinhood/rosetta/eventlogging/DirectDepositSwitcherContext$DistributionType;", "feature-direct-deposit_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.directdeposit.ui.switcher.atomic.TransactEventLoggingKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class TransactEventLogging {

    /* compiled from: TransactEventLogging.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.switcher.atomic.TransactEventLoggingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DirectDepositSwitcherContext.DistributionType.values().length];
            try {
                iArr[DirectDepositSwitcherContext.DistributionType.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DirectDepositSwitcherContext.DistributionType.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DirectDepositSwitcherContext.DistributionType.DISTRIBUTION_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransactEvent.Interaction.InteractionType.values().length];
            try {
                iArr2[TransactEvent.Interaction.InteractionType.SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TransactEvent.Interaction.InteractionType.SELECT_COMPANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TransactEvent.Interaction.InteractionType.SEARCH_BY_PAYROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TransactEvent.Interaction.InteractionType.SELECT_PAYROLL_PROVIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TransactEvent.Interaction.InteractionType.SELECT_FIXED_AMOUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TransactEvent.Interaction.InteractionType.SELECT_PERCENTAGE_AMOUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[TransactEvent.Interaction.InteractionType.AUTHENTICATION_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[TransactEvent.Interaction.InteractionType.FORGOT_CREDENTIALS.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[TransactEvent.Interaction.InteractionType.AUTHENTICATION_SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[TransactEvent.Interaction.InteractionType.AUTHENTICATION_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[TransactEvent.Interaction.InteractionType.AUTHENTICATION_MFA.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final UserInteractionEventData toUserInteractionEventData(TransactEvent.Close close, Screen screen) {
        Intrinsics.checkNotNullParameter(close, "<this>");
        Intrinsics.checkNotNullParameter(screen, "screen");
        UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.TAP;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        String reason = close.getPayload().getReason();
        if (reason == null) {
            reason = "unknown";
        }
        return new UserInteractionEventData(eventType, screen, component, action, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, new DirectDepositSwitcherContext(null, reason, null, 0.0d, null, 29, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, -1, -1, -1, -1, 16383, null), null, null, 96, null);
    }

    public static final UserInteractionEventData toUserInteractionEventData(TransactEvent.Interaction interaction) {
        Intrinsics.checkNotNullParameter(interaction, "<this>");
        Screen.Name screenName = interaction.getInteractionType().getScreenName();
        if (screenName != null) {
            return new UserInteractionEventData(UserInteractionEventData.EventType.APPEAR, new Screen(screenName, null, null, null, 14, null), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        }
        return createUserInteractionEvent(interaction);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x099c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final UserInteractionEventData createUserInteractionEvent(TransactEvent.Interaction interaction) {
        Screen.Name name;
        Screen.Name name2;
        switch (WhenMappings.$EnumSwitchMapping$1[interaction.getInteractionType().ordinal()]) {
            case 1:
                return new UserInteractionEventData(UserInteractionEventData.EventType.TAP, new Screen(Screen.Name.DD_SWITCHER_SEARCH_COMPANY, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), UserInteractionEventData.Action.SEARCH_DD_SWITCHER_COMPANY, null, null, null, 112, null);
            case 2:
                return new UserInteractionEventData(UserInteractionEventData.EventType.TAP, new Screen(Screen.Name.DD_SWITCHER_SEARCH_COMPANY, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), UserInteractionEventData.Action.SELECT_DD_SWITCHER_COMPANY, null, null, null, 112, null);
            case 3:
                return new UserInteractionEventData(UserInteractionEventData.EventType.TAP, new Screen(Screen.Name.DD_SWITCHER_SEARCH_COMPANY, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), UserInteractionEventData.Action.VIEW_DD_SWITCHER_SEARCH_PAYROLL, null, null, null, 112, null);
            case 4:
                return new UserInteractionEventData(UserInteractionEventData.EventType.TAP, new Screen(Screen.Name.DD_SWITCHER_SEARCH_PAYROLL, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), UserInteractionEventData.Action.SELECT_DD_SWITCHER_PAYROLL, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, new DirectDepositSwitcherContext(getPayrollProvider(interaction.getPayload()), null, null, 0.0d, null, 30, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, -1, -1, -1, -1, 16383, null), null, null, 96, null);
            case 5:
            case 6:
                DirectDepositSwitcherContext.DistributionType distributionType = getDistributionType(interaction.getPayload());
                int i = WhenMappings.$EnumSwitchMapping$0[distributionType.ordinal()];
                if (i == 1) {
                    name = Screen.Name.DD_SWITCHER_OPTION_FIXED;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        name2 = null;
                        return new UserInteractionEventData(UserInteractionEventData.EventType.TAP, name2 != null ? new Screen(name2, null, null, null, 14, null) : null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), UserInteractionEventData.Action.SELECT_DD_SWITCHER_PARTIAL_AMOUNT, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, new DirectDepositSwitcherContext(null, null, distributionType, getDistributionAmount(interaction.getPayload()), null, 19, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, -1, -1, -1, -1, 16383, null), null, null, 96, null);
                    }
                    name = Screen.Name.DD_SWITCHER_OPTION_PERCENT;
                }
                name2 = name;
                if (name2 != null) {
                }
                return new UserInteractionEventData(UserInteractionEventData.EventType.TAP, name2 != null ? new Screen(name2, null, null, null, 14, null) : null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), UserInteractionEventData.Action.SELECT_DD_SWITCHER_PARTIAL_AMOUNT, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, new DirectDepositSwitcherContext(null, null, distributionType, getDistributionAmount(interaction.getPayload()), null, 19, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, -1, -1, -1, -1, 16383, null), null, null, 96, null);
            case 7:
                return new UserInteractionEventData(UserInteractionEventData.EventType.TAP, new Screen(Screen.Name.DD_SWITCHER_AUTHENTICATION, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), UserInteractionEventData.Action.START_DD_SWITCHER_AUTHENTICATION, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, new DirectDepositSwitcherContext(getPayrollProvider(interaction.getPayload()), null, null, 0.0d, null, 30, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, -1, -1, -1, -1, 16383, null), null, null, 96, null);
            case 8:
                return new UserInteractionEventData(UserInteractionEventData.EventType.TAP, new Screen(Screen.Name.DD_SWITCHER_AUTHENTICATION, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), UserInteractionEventData.Action.VIEW_DD_SWITCHER_FORGOT_CREDENTIALS, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, new DirectDepositSwitcherContext(getPayrollProvider(interaction.getPayload()), null, null, 0.0d, null, 30, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, -1, -1, -1, -1, 16383, null), null, null, 96, null);
            case 9:
                return new UserInteractionEventData(UserInteractionEventData.EventType.APPEAR, new Screen(Screen.Name.DD_SWITCHER_AUTHENTICATION, null, null, null, 14, null), null, UserInteractionEventData.Action.VIEW_DD_SWITCHER_AUTHENTICATION_SUCCESS, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, new DirectDepositSwitcherContext(getPayrollProvider(interaction.getPayload()), null, null, 0.0d, null, 30, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, -1, -1, -1, -1, 16383, null), null, null, 100, null);
            case 10:
                return new UserInteractionEventData(UserInteractionEventData.EventType.APPEAR, new Screen(Screen.Name.DD_SWITCHER_AUTHENTICATION, null, null, null, 14, null), null, UserInteractionEventData.Action.VIEW_DD_SWITCHER_AUTHENTICATION_ERROR, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, new DirectDepositSwitcherContext(getPayrollProvider(interaction.getPayload()), null, null, 0.0d, null, 30, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, -1, -1, -1, -1, 16383, null), null, null, 100, null);
            case 11:
                return new UserInteractionEventData(UserInteractionEventData.EventType.APPEAR, new Screen(Screen.Name.DD_SWITCHER_AUTHENTICATION, null, null, null, 14, null), null, UserInteractionEventData.Action.VIEW_DD_SWITCHER_AUTHENTICATION_MFA, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, new DirectDepositSwitcherContext(getPayrollProvider(interaction.getPayload()), null, null, 0.0d, null, 30, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, -1, -1, -1, -1, 16383, null), null, null, 100, null);
            default:
                return null;
        }
    }

    private static final String getPayrollProvider(TransactEvent.Interaction.Payload payload) {
        String string2;
        Object obj = payload.getValue().get("payroll");
        return (obj == null || (string2 = obj.toString()) == null) ? "undefined" : string2;
    }

    private static final double getDistributionAmount(TransactEvent.Interaction.Payload payload) {
        String string2;
        Double doubleOrNull;
        Object obj = payload.getValue().get("distributionAmount");
        if (obj == null || (string2 = obj.toString()) == null || (doubleOrNull = StringsKt.toDoubleOrNull(string2)) == null) {
            return 0.0d;
        }
        return doubleOrNull.doubleValue();
    }

    private static final DirectDepositSwitcherContext.DistributionType getDistributionType(TransactEvent.Interaction.Payload payload) {
        Object obj = payload.getValue().get("distributionType");
        return Intrinsics.areEqual(obj, "fixed") ? DirectDepositSwitcherContext.DistributionType.FIXED : Intrinsics.areEqual(obj, "percent") ? DirectDepositSwitcherContext.DistributionType.PERCENT : DirectDepositSwitcherContext.DistributionType.DISTRIBUTION_TYPE_UNSPECIFIED;
    }
}
