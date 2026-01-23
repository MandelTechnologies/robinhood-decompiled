package com.robinhood.android.options.settings;

import android.content.res.Resources;
import com.robinhood.models.p320db.OptionLevel;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSettingContract.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/options/settings/ChangeOptionLevelState;", "", "targetOptionLevel", "", "result", "Lcom/robinhood/android/options/settings/ChangeOptionLevelState$Result;", "throwable", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/settings/ChangeOptionLevelState$Result;Ljava/lang/Throwable;)V", "getTargetOptionLevel", "()Ljava/lang/String;", "getResult", "()Lcom/robinhood/android/options/settings/ChangeOptionLevelState$Result;", "getThrowable", "()Ljava/lang/Throwable;", "autoFinish", "", "getAutoFinish", "()Z", "getToastMessage", "resources", "Landroid/content/res/Resources;", "accountDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Result", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChangeOptionLevelState {
    public static final int $stable = 8;
    private final Result result;
    private final String targetOptionLevel;
    private final Throwable throwable;

    public static /* synthetic */ ChangeOptionLevelState copy$default(ChangeOptionLevelState changeOptionLevelState, String str, Result result, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeOptionLevelState.targetOptionLevel;
        }
        if ((i & 2) != 0) {
            result = changeOptionLevelState.result;
        }
        if ((i & 4) != 0) {
            th = changeOptionLevelState.throwable;
        }
        return changeOptionLevelState.copy(str, result, th);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTargetOptionLevel() {
        return this.targetOptionLevel;
    }

    /* renamed from: component2, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final ChangeOptionLevelState copy(String targetOptionLevel, Result result, Throwable throwable) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new ChangeOptionLevelState(targetOptionLevel, result, throwable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeOptionLevelState)) {
            return false;
        }
        ChangeOptionLevelState changeOptionLevelState = (ChangeOptionLevelState) other;
        return Intrinsics.areEqual(this.targetOptionLevel, changeOptionLevelState.targetOptionLevel) && this.result == changeOptionLevelState.result && Intrinsics.areEqual(this.throwable, changeOptionLevelState.throwable);
    }

    public int hashCode() {
        String str = this.targetOptionLevel;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.result.hashCode()) * 31;
        Throwable th = this.throwable;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "ChangeOptionLevelState(targetOptionLevel=" + this.targetOptionLevel + ", result=" + this.result + ", throwable=" + this.throwable + ")";
    }

    public ChangeOptionLevelState(String str, Result result, Throwable th) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.targetOptionLevel = str;
        this.result = result;
        this.throwable = th;
    }

    public /* synthetic */ ChangeOptionLevelState(String str, Result result, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, result, (i & 4) != 0 ? null : th);
    }

    public final String getTargetOptionLevel() {
        return this.targetOptionLevel;
    }

    public final Result getResult() {
        return this.result;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean getAutoFinish() {
        return this.targetOptionLevel == null && this.result == Result.SUCCESS;
    }

    public final String getToastMessage(Resources resources, StringResource accountDisplayName) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Tuples2 tuples2M3642to = Tuples4.m3642to(this.targetOptionLevel, this.result);
        Result result = Result.PENDING;
        if (Intrinsics.areEqual(tuples2M3642to, Tuples4.m3642to(OptionLevel.LEVEL_2, result))) {
            return resources.getString(C23695R.string.options_setting_downgrade_to_basic_pending);
        }
        Result result2 = Result.SUCCESS;
        if (Intrinsics.areEqual(tuples2M3642to, Tuples4.m3642to(OptionLevel.LEVEL_2, result2))) {
            return resources.getString(C23695R.string.options_setting_downgrade_to_basic_success);
        }
        OptionLevel optionLevel = OptionLevel.INSTANCE;
        if (Intrinsics.areEqual(tuples2M3642to, Tuples4.m3642to(optionLevel.getDOWNGRADE(), result))) {
            if (accountDisplayName != null) {
                return resources.getString(C23695R.string.options_setting_remove_options_pending_with_account_type, accountDisplayName.getText(resources));
            }
            return resources.getString(C23695R.string.options_setting_remove_options_pending);
        }
        if (!Intrinsics.areEqual(tuples2M3642to, Tuples4.m3642to(optionLevel.getDOWNGRADE(), result2))) {
            return null;
        }
        if (accountDisplayName != null) {
            return resources.getString(C23695R.string.options_setting_remove_options_success_with_account_type, accountDisplayName.getText(resources));
        }
        return resources.getString(C23695R.string.options_setting_remove_options_success);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionsSettingContract.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/settings/ChangeOptionLevelState$Result;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "PENDING", "FAILURE", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Result {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;
        public static final Result SUCCESS = new Result("SUCCESS", 0);
        public static final Result PENDING = new Result("PENDING", 1);
        public static final Result FAILURE = new Result("FAILURE", 2);

        private static final /* synthetic */ Result[] $values() {
            return new Result[]{SUCCESS, PENDING, FAILURE};
        }

        public static EnumEntries<Result> getEntries() {
            return $ENTRIES;
        }

        private Result(String str, int i) {
        }

        static {
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = EnumEntries2.enumEntries(resultArr$values);
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }
}
