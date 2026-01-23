package com.robinhood.android.redesign.accounttab.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewUserExperienceStage.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "PULL_DOWN", "SWIPE", "DONE", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NewUserExperienceStage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NewUserExperienceStage[] $VALUES;
    public static final NewUserExperienceStage PENDING = new NewUserExperienceStage("PENDING", 0);
    public static final NewUserExperienceStage PULL_DOWN = new NewUserExperienceStage("PULL_DOWN", 1);
    public static final NewUserExperienceStage SWIPE = new NewUserExperienceStage("SWIPE", 2);
    public static final NewUserExperienceStage DONE = new NewUserExperienceStage("DONE", 3);

    private static final /* synthetic */ NewUserExperienceStage[] $values() {
        return new NewUserExperienceStage[]{PENDING, PULL_DOWN, SWIPE, DONE};
    }

    public static EnumEntries<NewUserExperienceStage> getEntries() {
        return $ENTRIES;
    }

    private NewUserExperienceStage(String str, int i) {
    }

    static {
        NewUserExperienceStage[] newUserExperienceStageArr$values = $values();
        $VALUES = newUserExperienceStageArr$values;
        $ENTRIES = EnumEntries2.enumEntries(newUserExperienceStageArr$values);
    }

    public static NewUserExperienceStage valueOf(String str) {
        return (NewUserExperienceStage) Enum.valueOf(NewUserExperienceStage.class, str);
    }

    public static NewUserExperienceStage[] values() {
        return (NewUserExperienceStage[]) $VALUES.clone();
    }
}
