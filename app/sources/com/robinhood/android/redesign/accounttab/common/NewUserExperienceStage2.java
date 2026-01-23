package com.robinhood.android.redesign.accounttab.common;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewUserExperienceStage.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"next", "Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;", "lib-account-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesign.accounttab.common.NewUserExperienceStageKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class NewUserExperienceStage2 {

    /* compiled from: NewUserExperienceStage.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.redesign.accounttab.common.NewUserExperienceStageKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewUserExperienceStage.values().length];
            try {
                iArr[NewUserExperienceStage.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewUserExperienceStage.PULL_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NewUserExperienceStage.SWIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NewUserExperienceStage.DONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final NewUserExperienceStage next(NewUserExperienceStage newUserExperienceStage) {
        Intrinsics.checkNotNullParameter(newUserExperienceStage, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[newUserExperienceStage.ordinal()];
        if (i == 1) {
            return NewUserExperienceStage.PULL_DOWN;
        }
        if (i == 2) {
            return NewUserExperienceStage.SWIPE;
        }
        if (i == 3) {
            return NewUserExperienceStage.DONE;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return NewUserExperienceStage.DONE;
    }
}
