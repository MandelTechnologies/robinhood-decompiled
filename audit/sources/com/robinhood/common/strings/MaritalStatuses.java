package com.robinhood.common.strings;

import android.content.res.Resources;
import com.robinhood.models.api.identi.MaritalStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaritalStatuses.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getDisplayName", "", "Lcom/robinhood/models/api/identi/MaritalStatus;", "resources", "Landroid/content/res/Resources;", "lib-common-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.common.strings.MaritalStatusesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class MaritalStatuses {

    /* compiled from: MaritalStatuses.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.common.strings.MaritalStatusesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MaritalStatus.values().length];
            try {
                iArr[MaritalStatus.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MaritalStatus.MARRIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MaritalStatus.DIVORCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MaritalStatus.WIDOWED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MaritalStatus.UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MaritalStatus.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getDisplayName(MaritalStatus maritalStatus, Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(maritalStatus, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$0[maritalStatus.ordinal()]) {
            case 1:
                i = C32428R.string.marital_status_single;
                break;
            case 2:
                i = C32428R.string.marital_status_married;
                break;
            case 3:
                i = C32428R.string.marital_status_divorced;
                break;
            case 4:
                i = C32428R.string.marital_status_widowed;
                break;
            case 5:
                i = C32428R.string.marital_status_unknown;
                break;
            case 6:
                i = C32428R.string.marital_status_unknown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
