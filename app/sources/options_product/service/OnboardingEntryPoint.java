package options_product.service;

import com.robinhood.android.educationtour.EducationTourScreenNames;
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
/* compiled from: OnboardingEntryPoint.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Loptions_product/service/OnboardingEntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ONBOARDING_ENTRY_POINT_UNSPECIFIED", EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, "JA_ACATS", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class OnboardingEntryPoint implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OnboardingEntryPoint[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OnboardingEntryPoint> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OnboardingEntryPoint JA_ACATS;
    public static final OnboardingEntryPoint ONBOARDING_ENTRY_POINT_UNSPECIFIED;
    public static final OnboardingEntryPoint STOCK_DETAIL_PAGE;
    private final int value;

    private static final /* synthetic */ OnboardingEntryPoint[] $values() {
        return new OnboardingEntryPoint[]{ONBOARDING_ENTRY_POINT_UNSPECIFIED, STOCK_DETAIL_PAGE, JA_ACATS};
    }

    @JvmStatic
    public static final OnboardingEntryPoint fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OnboardingEntryPoint> getEntries() {
        return $ENTRIES;
    }

    private OnboardingEntryPoint(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OnboardingEntryPoint onboardingEntryPoint = new OnboardingEntryPoint("ONBOARDING_ENTRY_POINT_UNSPECIFIED", 0, 0);
        ONBOARDING_ENTRY_POINT_UNSPECIFIED = onboardingEntryPoint;
        STOCK_DETAIL_PAGE = new OnboardingEntryPoint(EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, 1, 1);
        JA_ACATS = new OnboardingEntryPoint("JA_ACATS", 2, 2);
        OnboardingEntryPoint[] onboardingEntryPointArr$values = $values();
        $VALUES = onboardingEntryPointArr$values;
        $ENTRIES = EnumEntries2.enumEntries(onboardingEntryPointArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OnboardingEntryPoint.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OnboardingEntryPoint>(orCreateKotlinClass, syntax, onboardingEntryPoint) { // from class: options_product.service.OnboardingEntryPoint$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OnboardingEntryPoint fromValue(int value) {
                return OnboardingEntryPoint.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OnboardingEntryPoint.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/OnboardingEntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/OnboardingEntryPoint;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OnboardingEntryPoint fromValue(int value) {
            if (value == 0) {
                return OnboardingEntryPoint.ONBOARDING_ENTRY_POINT_UNSPECIFIED;
            }
            if (value == 1) {
                return OnboardingEntryPoint.STOCK_DETAIL_PAGE;
            }
            if (value != 2) {
                return null;
            }
            return OnboardingEntryPoint.JA_ACATS;
        }
    }

    public static OnboardingEntryPoint valueOf(String str) {
        return (OnboardingEntryPoint) Enum.valueOf(OnboardingEntryPoint.class, str);
    }

    public static OnboardingEntryPoint[] values() {
        return (OnboardingEntryPoint[]) $VALUES.clone();
    }
}
