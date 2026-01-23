package bonfire.proto.idl.advisor_marketplace.p029v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvisorMatchFeedbackOption.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackOption;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ADVISOR_MATCH_FEEDBACK_OPTION_UNSPECIFIED", "ADVISOR_MATCH_FEEDBACK_OPTION_NOT_GOOD_FIT", "ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_EXPERIENCE", "ADVISOR_MATCH_FEEDBACK_OPTION_DIDNT_MEET_NEEDS", "ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_INFO", "ADVISOR_MATCH_FEEDBACK_OPTION_OTHER", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorMatchFeedbackOption implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvisorMatchFeedbackOption[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AdvisorMatchFeedbackOption> ADAPTER;
    public static final AdvisorMatchFeedbackOption ADVISOR_MATCH_FEEDBACK_OPTION_DIDNT_MEET_NEEDS;
    public static final AdvisorMatchFeedbackOption ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_EXPERIENCE;
    public static final AdvisorMatchFeedbackOption ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_INFO;
    public static final AdvisorMatchFeedbackOption ADVISOR_MATCH_FEEDBACK_OPTION_NOT_GOOD_FIT;
    public static final AdvisorMatchFeedbackOption ADVISOR_MATCH_FEEDBACK_OPTION_OTHER;
    public static final AdvisorMatchFeedbackOption ADVISOR_MATCH_FEEDBACK_OPTION_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ AdvisorMatchFeedbackOption[] $values() {
        return new AdvisorMatchFeedbackOption[]{ADVISOR_MATCH_FEEDBACK_OPTION_UNSPECIFIED, ADVISOR_MATCH_FEEDBACK_OPTION_NOT_GOOD_FIT, ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_EXPERIENCE, ADVISOR_MATCH_FEEDBACK_OPTION_DIDNT_MEET_NEEDS, ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_INFO, ADVISOR_MATCH_FEEDBACK_OPTION_OTHER};
    }

    @JvmStatic
    public static final AdvisorMatchFeedbackOption fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AdvisorMatchFeedbackOption> getEntries() {
        return $ENTRIES;
    }

    private AdvisorMatchFeedbackOption(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AdvisorMatchFeedbackOption advisorMatchFeedbackOption = new AdvisorMatchFeedbackOption("ADVISOR_MATCH_FEEDBACK_OPTION_UNSPECIFIED", 0, 0);
        ADVISOR_MATCH_FEEDBACK_OPTION_UNSPECIFIED = advisorMatchFeedbackOption;
        ADVISOR_MATCH_FEEDBACK_OPTION_NOT_GOOD_FIT = new AdvisorMatchFeedbackOption("ADVISOR_MATCH_FEEDBACK_OPTION_NOT_GOOD_FIT", 1, 1);
        ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_EXPERIENCE = new AdvisorMatchFeedbackOption("ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_EXPERIENCE", 2, 2);
        ADVISOR_MATCH_FEEDBACK_OPTION_DIDNT_MEET_NEEDS = new AdvisorMatchFeedbackOption("ADVISOR_MATCH_FEEDBACK_OPTION_DIDNT_MEET_NEEDS", 3, 3);
        ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_INFO = new AdvisorMatchFeedbackOption("ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_INFO", 4, 4);
        ADVISOR_MATCH_FEEDBACK_OPTION_OTHER = new AdvisorMatchFeedbackOption("ADVISOR_MATCH_FEEDBACK_OPTION_OTHER", 5, 5);
        AdvisorMatchFeedbackOption[] advisorMatchFeedbackOptionArr$values = $values();
        $VALUES = advisorMatchFeedbackOptionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(advisorMatchFeedbackOptionArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorMatchFeedbackOption.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AdvisorMatchFeedbackOption>(orCreateKotlinClass, syntax, advisorMatchFeedbackOption) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorMatchFeedbackOption$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AdvisorMatchFeedbackOption fromValue(int value) {
                return AdvisorMatchFeedbackOption.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AdvisorMatchFeedbackOption.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackOption$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMatchFeedbackOption;", "fromValue", "value", "", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisorMatchFeedbackOption fromValue(int value) {
            if (value == 0) {
                return AdvisorMatchFeedbackOption.ADVISOR_MATCH_FEEDBACK_OPTION_UNSPECIFIED;
            }
            if (value == 1) {
                return AdvisorMatchFeedbackOption.ADVISOR_MATCH_FEEDBACK_OPTION_NOT_GOOD_FIT;
            }
            if (value == 2) {
                return AdvisorMatchFeedbackOption.ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_EXPERIENCE;
            }
            if (value == 3) {
                return AdvisorMatchFeedbackOption.ADVISOR_MATCH_FEEDBACK_OPTION_DIDNT_MEET_NEEDS;
            }
            if (value == 4) {
                return AdvisorMatchFeedbackOption.ADVISOR_MATCH_FEEDBACK_OPTION_NOT_ENOUGH_INFO;
            }
            if (value != 5) {
                return null;
            }
            return AdvisorMatchFeedbackOption.ADVISOR_MATCH_FEEDBACK_OPTION_OTHER;
        }
    }

    public static AdvisorMatchFeedbackOption valueOf(String str) {
        return (AdvisorMatchFeedbackOption) Enum.valueOf(AdvisorMatchFeedbackOption.class, str);
    }

    public static AdvisorMatchFeedbackOption[] values() {
        return (AdvisorMatchFeedbackOption[]) $VALUES.clone();
    }
}
