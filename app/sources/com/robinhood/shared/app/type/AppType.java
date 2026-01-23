package com.robinhood.shared.app.type;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.g11n.iso.RegionCode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppType.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/app/type/AppType;", "", "<init>", "(Ljava/lang/String;I)V", "NCW", "RHC", "TRADER", "toAppName", "", "resources", "Landroid/content/res/Resources;", "toRegionCode", "Lcom/robinhood/g11n/iso/RegionCode;", "Companion", "lib-app-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AppType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final String META_DATA_KEY = "com.robinhood.APP_TYPE";
    public static final AppType NCW = new AppType("NCW", 0);
    public static final AppType RHC = new AppType("RHC", 1);
    public static final AppType TRADER = new AppType("TRADER", 2);

    /* compiled from: AppType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.NCW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ AppType[] $values() {
        return new AppType[]{NCW, RHC, TRADER};
    }

    public static EnumEntries<AppType> getEntries() {
        return $ENTRIES;
    }

    private AppType(String str, int i) {
    }

    static {
        AppType[] appTypeArr$values = $values();
        $VALUES = appTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(appTypeArr$values);
        INSTANCE = new Companion(null);
    }

    public final String toAppName(Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            i = C37346R.string.app_name_gateway;
        } else if (i2 == 2) {
            i = C37346R.string.app_name_rhc;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C37346R.string.app_name_trader;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final RegionCode toRegionCode() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            throw new IllegalStateException((this + " not supported").toString());
        }
        if (i == 2) {
            return RegionCode.f5251EU;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return RegionCode.f5252US;
    }

    /* compiled from: AppType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/app/type/AppType$Companion;", "", "<init>", "()V", "META_DATA_KEY", "", "from", "Lcom/robinhood/shared/app/type/AppType;", "context", "Landroid/content/Context;", "lib-app-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AppType from(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(AppType.META_DATA_KEY);
            if (string2 == null) {
                throw new IllegalStateException(("Manifest must declare the `com.robinhood.APP_TYPE` metadata key with one of: " + AppType.getEntries()).toString());
            }
            return AppType.valueOf(string2);
        }
    }

    public static AppType valueOf(String str) {
        return (AppType) Enum.valueOf(AppType.class, str);
    }

    public static AppType[] values() {
        return (AppType[]) $VALUES.clone();
    }
}
