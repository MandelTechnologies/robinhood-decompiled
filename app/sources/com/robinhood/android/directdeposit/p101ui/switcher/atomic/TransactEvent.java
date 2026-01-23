package com.robinhood.android.directdeposit.p101ui.switcher.atomic;

import com.robinhood.enums.RhEnum;
import com.robinhood.rosetta.eventlogging.Screen;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactEvent.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0007\b\t\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent;", "", TransactEvent.KEY_EVENT_TYPE, "", "<init>", "(Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "Interaction", "Close", "OpenUrl", "Finish", "AutomationHandoff", "AdapterModule", "Companion", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$AutomationHandoff;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Close;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Finish;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$OpenUrl;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class TransactEvent {
    public static final int $stable = 0;
    private static final String KEY_EVENT_TYPE = "event";
    private static final String TYPE_AUTOMATION_HANDOFF = "atomic-transact-automation-handoff";
    private static final String TYPE_CLOSE = "atomic-transact-close";
    private static final String TYPE_FINISH = "atomic-transact-finish";
    private static final String TYPE_INTERACTION = "atomic-transact-interaction";
    private static final String TYPE_OPEN_URL = "atomic-transact-open-url";
    private final String event;

    public /* synthetic */ TransactEvent(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private TransactEvent(String str) {
        this.event = str;
    }

    public final String getEvent() {
        return this.event;
    }

    /* compiled from: TransactEvent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent;", "payload", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$Payload;", "<init>", "(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$Payload;)V", "getPayload", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$Payload;", "interactionType", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$InteractionType;", "getInteractionType", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$InteractionType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Payload", "InteractionType", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Interaction extends TransactEvent {
        public static final int $stable = 8;
        private final InteractionType interactionType;
        private final Payload payload;

        public static /* synthetic */ Interaction copy$default(Interaction interaction, Payload payload, int i, Object obj) {
            if ((i & 1) != 0) {
                payload = interaction.payload;
            }
            return interaction.copy(payload);
        }

        /* renamed from: component1, reason: from getter */
        public final Payload getPayload() {
            return this.payload;
        }

        public final Interaction copy(Payload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return new Interaction(payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Interaction) && Intrinsics.areEqual(this.payload, ((Interaction) other).payload);
        }

        public int hashCode() {
            return this.payload.hashCode();
        }

        public String toString() {
            return "Interaction(payload=" + this.payload + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Interaction(Payload payload) {
            super(TransactEvent.TYPE_INTERACTION, null);
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
            this.interactionType = payload.getType();
        }

        public final Payload getPayload() {
            return this.payload;
        }

        public final InteractionType getInteractionType() {
            return this.interactionType;
        }

        /* compiled from: TransactEvent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$Payload;", "", "type", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$InteractionType;", "value", "", "", "<init>", "(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$InteractionType;Ljava/util/Map;)V", "getType", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$InteractionType;", "getValue", "()Ljava/util/Map;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes27.dex */
        public static final class Payload {
            public static final int $stable = 8;
            private final InteractionType type;
            private final Map<String, Object> value;

            public Payload(@Json(name = "name") InteractionType type2, Map<String, ? extends Object> value) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.type = type2;
                this.value = value;
            }

            public final InteractionType getType() {
                return this.type;
            }

            public final Map<String, Object> getValue() {
                return this.value;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TransactEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Interaction$InteractionType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "STEP_SEARCH_COMPANY", "SEARCH", "SELECT_COMPANY", "SEARCH_BY_PAYROLL", "STEP_SEARCH_PAYROLL", "SELECT_PAYROLL_PROVIDER", "STEP_DEPOSIT_OPTIONS", "STEP_DEPOSIT_OPTION_PERCENTAGE", "STEP_DEPOSIT_OPTION_FIXED", "SELECT_PERCENTAGE_AMOUNT", "SELECT_FIXED_AMOUNT", "AUTHENTICATION_LOGIN", "AUTHENTICATION_START", "AUTHENTICATION_SUCCESS", "AUTHENTICATION_ERROR", "AUTHENTICATION_MFA", "FORGOT_CREDENTIALS", "AUTHENTICATION_LOGIN_HELP", "UNSUPPORTED", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes27.dex */
        public static final class InteractionType implements RhEnum<InteractionType> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ InteractionType[] $VALUES;
            private final String serverValue;
            public static final InteractionType STEP_SEARCH_COMPANY = new InteractionType("STEP_SEARCH_COMPANY", 0, "Viewed Search By Company Page");
            public static final InteractionType SEARCH = new InteractionType("SEARCH", 1, "Search By Company");
            public static final InteractionType SELECT_COMPANY = new InteractionType("SELECT_COMPANY", 2, "Selected Company From Search By Company Page");
            public static final InteractionType SEARCH_BY_PAYROLL = new InteractionType("SEARCH_BY_PAYROLL", 3, "Clicked Search Payroll Companies From Search By Company Page");
            public static final InteractionType STEP_SEARCH_PAYROLL = new InteractionType("STEP_SEARCH_PAYROLL", 4, "Viewed Search By Payroll Page");
            public static final InteractionType SELECT_PAYROLL_PROVIDER = new InteractionType("SELECT_PAYROLL_PROVIDER", 5, "Selected Payroll Provider From Search By Payroll Page");
            public static final InteractionType STEP_DEPOSIT_OPTIONS = new InteractionType("STEP_DEPOSIT_OPTIONS", 6, "Viewed Select From Deposit Options Page");
            public static final InteractionType STEP_DEPOSIT_OPTION_PERCENTAGE = new InteractionType("STEP_DEPOSIT_OPTION_PERCENTAGE", 7, "Viewed Percentage Deposit Amount Page");
            public static final InteractionType STEP_DEPOSIT_OPTION_FIXED = new InteractionType("STEP_DEPOSIT_OPTION_FIXED", 8, "Viewed Fixed Deposit Amount Page");
            public static final InteractionType SELECT_PERCENTAGE_AMOUNT = new InteractionType("SELECT_PERCENTAGE_AMOUNT", 9, "Clicked Continue From Percentage Deposit Amount Page");
            public static final InteractionType SELECT_FIXED_AMOUNT = new InteractionType("SELECT_FIXED_AMOUNT", 10, "Clicked Continue From Fixed Deposit Amount Page");
            public static final InteractionType AUTHENTICATION_LOGIN = new InteractionType("AUTHENTICATION_LOGIN", 11, "Viewed Login Page");
            public static final InteractionType AUTHENTICATION_START = new InteractionType("AUTHENTICATION_START", 12, "Clicked Button To Start Authentication");
            public static final InteractionType AUTHENTICATION_SUCCESS = new InteractionType("AUTHENTICATION_SUCCESS", 13, "Viewed Authentication Success Page");
            public static final InteractionType AUTHENTICATION_ERROR = new InteractionType("AUTHENTICATION_ERROR", 14, "Viewed Authentication Failed Page");
            public static final InteractionType AUTHENTICATION_MFA = new InteractionType("AUTHENTICATION_MFA", 15, "Viewed MFA Page");
            public static final InteractionType FORGOT_CREDENTIALS = new InteractionType("FORGOT_CREDENTIALS", 16, "Viewed Login Recovery Page");
            public static final InteractionType AUTHENTICATION_LOGIN_HELP = new InteractionType("AUTHENTICATION_LOGIN_HELP", 17, "Viewed Login Help Page");
            public static final InteractionType UNSUPPORTED = new InteractionType("UNSUPPORTED", 18, "Unsupported");

            /* compiled from: TransactEvent.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[InteractionType.values().length];
                    try {
                        iArr[InteractionType.STEP_SEARCH_COMPANY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InteractionType.STEP_SEARCH_PAYROLL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[InteractionType.STEP_DEPOSIT_OPTIONS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[InteractionType.STEP_DEPOSIT_OPTION_FIXED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[InteractionType.STEP_DEPOSIT_OPTION_PERCENTAGE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[InteractionType.AUTHENTICATION_LOGIN.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[InteractionType.AUTHENTICATION_LOGIN_HELP.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[InteractionType.SEARCH.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[InteractionType.SELECT_COMPANY.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[InteractionType.SELECT_PAYROLL_PROVIDER.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[InteractionType.SEARCH_BY_PAYROLL.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[InteractionType.SELECT_PERCENTAGE_AMOUNT.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[InteractionType.SELECT_FIXED_AMOUNT.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[InteractionType.AUTHENTICATION_START.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[InteractionType.AUTHENTICATION_SUCCESS.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[InteractionType.AUTHENTICATION_ERROR.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[InteractionType.AUTHENTICATION_MFA.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[InteractionType.FORGOT_CREDENTIALS.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[InteractionType.UNSUPPORTED.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private static final /* synthetic */ InteractionType[] $values() {
                return new InteractionType[]{STEP_SEARCH_COMPANY, SEARCH, SELECT_COMPANY, SEARCH_BY_PAYROLL, STEP_SEARCH_PAYROLL, SELECT_PAYROLL_PROVIDER, STEP_DEPOSIT_OPTIONS, STEP_DEPOSIT_OPTION_PERCENTAGE, STEP_DEPOSIT_OPTION_FIXED, SELECT_PERCENTAGE_AMOUNT, SELECT_FIXED_AMOUNT, AUTHENTICATION_LOGIN, AUTHENTICATION_START, AUTHENTICATION_SUCCESS, AUTHENTICATION_ERROR, AUTHENTICATION_MFA, FORGOT_CREDENTIALS, AUTHENTICATION_LOGIN_HELP, UNSUPPORTED};
            }

            public static EnumEntries<InteractionType> getEntries() {
                return $ENTRIES;
            }

            private InteractionType(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                InteractionType[] interactionTypeArr$values = $values();
                $VALUES = interactionTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(interactionTypeArr$values);
                INSTANCE = new Companion(null);
            }

            public final Screen.Name getScreenName() {
                switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                    case 1:
                        return Screen.Name.DD_SWITCHER_SEARCH_COMPANY;
                    case 2:
                        return Screen.Name.DD_SWITCHER_SEARCH_PAYROLL;
                    case 3:
                        return Screen.Name.DD_SWITCHER_OPTIONS;
                    case 4:
                        return Screen.Name.DD_SWITCHER_OPTION_FIXED;
                    case 5:
                        return Screen.Name.DD_SWITCHER_OPTION_PERCENT;
                    case 6:
                        return Screen.Name.DD_SWITCHER_AUTHENTICATION;
                    case 7:
                        return Screen.Name.DD_SWITCHER_AUTHENTICATION_HELP;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        return null;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            public static InteractionType valueOf(String str) {
                return (InteractionType) Enum.valueOf(InteractionType.class, str);
            }

            public static InteractionType[] values() {
                return (InteractionType[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: TransactEvent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Close;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent;", "payload", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Close$Payload;", "<init>", "(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Close$Payload;)V", "getPayload", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Close$Payload;", "Payload", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Close extends TransactEvent {
        public static final int $stable = 0;
        private final Payload payload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Close(Payload payload) {
            super(TransactEvent.TYPE_CLOSE, null);
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }

        public final Payload getPayload() {
            return this.payload;
        }

        /* compiled from: TransactEvent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Close$Payload;", "", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes27.dex */
        public static final class Payload {
            public static final int $stable = 0;
            private final String reason;

            public Payload(String str) {
                this.reason = str;
            }

            public final String getReason() {
                return this.reason;
            }
        }
    }

    /* compiled from: TransactEvent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$OpenUrl;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent;", "payload", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$OpenUrl$Payload;", "<init>", "(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$OpenUrl$Payload;)V", "getPayload", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$OpenUrl$Payload;", "Payload", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OpenUrl extends TransactEvent {
        public static final int $stable = 0;
        private final Payload payload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(Payload payload) {
            super(TransactEvent.TYPE_OPEN_URL, null);
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }

        public final Payload getPayload() {
            return this.payload;
        }

        /* compiled from: TransactEvent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$OpenUrl$Payload;", "", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes27.dex */
        public static final class Payload {
            public static final int $stable = 0;
            private final String url;

            public Payload(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public final String getUrl() {
                return this.url;
            }
        }
    }

    /* compiled from: TransactEvent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$Finish;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Finish extends TransactEvent {
        public static final int $stable = 0;

        public Finish() {
            super(TransactEvent.TYPE_FINISH, null);
        }
    }

    /* compiled from: TransactEvent.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$AutomationHandoff;", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent;", "payload", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$AutomationHandoff$Payload;", "<init>", "(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$AutomationHandoff$Payload;)V", "getPayload", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$AutomationHandoff$Payload;", "Payload", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AutomationHandoff extends TransactEvent {
        public static final int $stable = 0;
        private final Payload payload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutomationHandoff(Payload payload) {
            super(TransactEvent.TYPE_AUTOMATION_HANDOFF, null);
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }

        public final Payload getPayload() {
            return this.payload;
        }

        /* compiled from: TransactEvent.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$AutomationHandoff$Payload;", "", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes27.dex */
        public static final class Payload {
            public static final int $stable = 0;
            private final String type;

            public Payload(String type2) {
                Intrinsics.checkNotNullParameter(type2, "type");
                this.type = type2;
            }

            public final String getType() {
                return this.type;
            }
        }
    }

    /* compiled from: TransactEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent$AdapterModule;", "", "<init>", "()V", "provideAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AdapterModule {
        public static final int $stable = 0;
        public static final AdapterModule INSTANCE = new AdapterModule();

        private AdapterModule() {
        }

        public final JsonAdapter.Factory provideAdapterFactory() {
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(TransactEvent.class, TransactEvent.KEY_EVENT_TYPE).withSubtype(Interaction.class, TransactEvent.TYPE_INTERACTION).withSubtype(Close.class, TransactEvent.TYPE_CLOSE).withSubtype(OpenUrl.class, TransactEvent.TYPE_OPEN_URL).withSubtype(Finish.class, TransactEvent.TYPE_FINISH).withSubtype(AutomationHandoff.class, TransactEvent.TYPE_AUTOMATION_HANDOFF);
            Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
            return polymorphicJsonAdapterFactoryWithSubtype;
        }
    }
}
