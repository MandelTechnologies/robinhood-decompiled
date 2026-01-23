package com.robinhood.android.lib.margin.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApiToggleMarginInvestingResponse.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "Lcom/robinhood/enums/RhEnum;", "Landroid/os/Parcelable;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "SUCCESS", "MARGIN_UPGRADE_ERROR", "GOLD_UPGRADE_ERROR", "ENABLE_MARGIN_INVESTING_ERROR", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResult, reason: use source file name */
/* loaded from: classes8.dex */
public final class ApiToggleMarginInvestingResponse2 implements RhEnum<ApiToggleMarginInvestingResponse2>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApiToggleMarginInvestingResponse2[] $VALUES;
    public static final Parcelable.Creator<ApiToggleMarginInvestingResponse2> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final ApiToggleMarginInvestingResponse2 SUCCESS = new ApiToggleMarginInvestingResponse2("SUCCESS", 0, "success");
    public static final ApiToggleMarginInvestingResponse2 MARGIN_UPGRADE_ERROR = new ApiToggleMarginInvestingResponse2("MARGIN_UPGRADE_ERROR", 1, "margin_upgrade_error");
    public static final ApiToggleMarginInvestingResponse2 GOLD_UPGRADE_ERROR = new ApiToggleMarginInvestingResponse2("GOLD_UPGRADE_ERROR", 2, "gold_upgrade_error");
    public static final ApiToggleMarginInvestingResponse2 ENABLE_MARGIN_INVESTING_ERROR = new ApiToggleMarginInvestingResponse2("ENABLE_MARGIN_INVESTING_ERROR", 3, "margin_investing_enable_error");

    private static final /* synthetic */ ApiToggleMarginInvestingResponse2[] $values() {
        return new ApiToggleMarginInvestingResponse2[]{SUCCESS, MARGIN_UPGRADE_ERROR, GOLD_UPGRADE_ERROR, ENABLE_MARGIN_INVESTING_ERROR};
    }

    @JvmStatic
    public static ApiToggleMarginInvestingResponse2 fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<ApiToggleMarginInvestingResponse2> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2) {
        return INSTANCE.toServerValue(apiToggleMarginInvestingResponse2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private ApiToggleMarginInvestingResponse2(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        ApiToggleMarginInvestingResponse2[] apiToggleMarginInvestingResponse2Arr$values = $values();
        $VALUES = apiToggleMarginInvestingResponse2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(apiToggleMarginInvestingResponse2Arr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<ApiToggleMarginInvestingResponse2>() { // from class: com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResult.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiToggleMarginInvestingResponse2 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ApiToggleMarginInvestingResponse2.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiToggleMarginInvestingResponse2[] newArray(int i) {
                return new ApiToggleMarginInvestingResponse2[i];
            }
        };
    }

    /* compiled from: ApiToggleMarginInvestingResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Required;", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResult$Companion, reason: from kotlin metadata */
    public static final class Companion extends RhEnum.Converter.Required<ApiToggleMarginInvestingResponse2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(ApiToggleMarginInvestingResponse2.values());
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(ApiToggleMarginInvestingResponse2 enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Required, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public ApiToggleMarginInvestingResponse2 fromServerValue(String serverValue) {
            return (ApiToggleMarginInvestingResponse2) super.fromServerValue(serverValue);
        }
    }

    public static ApiToggleMarginInvestingResponse2 valueOf(String str) {
        return (ApiToggleMarginInvestingResponse2) Enum.valueOf(ApiToggleMarginInvestingResponse2.class, str);
    }

    public static ApiToggleMarginInvestingResponse2[] values() {
        return (ApiToggleMarginInvestingResponse2[]) $VALUES.clone();
    }
}
