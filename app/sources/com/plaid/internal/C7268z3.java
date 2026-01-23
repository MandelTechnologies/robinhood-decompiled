package com.plaid.internal;

import android.content.res.Resources;
import com.plaid.internal.AbstractC5894L2;
import com.plaid.link.C7279R;
import com.plaid.link.result.LinkErrorCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.z3 */
/* loaded from: classes16.dex */
public final class C7268z3 {

    /* renamed from: a */
    public final Resources f3338a;

    /* renamed from: com.plaid.internal.z3$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3339a;

        static {
            int[] iArr = new int[EnumC5805B3.values().length];
            try {
                iArr[EnumC5805B3.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5805B3.SESSION_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5805B3.INITIALIZATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5805B3.HTTP_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5805B3.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3339a = iArr;
        }
    }

    public C7268z3(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f3338a = resources;
    }

    /* renamed from: a */
    public final AbstractC5894L2.i m1676a() {
        C6009X7.CREATOR.getClass();
        Intrinsics.checkNotNullParameter("unknown", "workflowId");
        C6009X7 c6009x7 = new C6009X7("unknown", "error_pane_id", "local_error_pane");
        EnumC5805B3 enumC5805B3 = EnumC5805B3.INITIALIZATION_ERROR;
        return new AbstractC5894L2.i("unknown", c6009x7, "", m1677a(enumC5805B3), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), CollectionsKt.emptyList(), "", enumC5805B3);
    }

    /* renamed from: a */
    public final String m1677a(EnumC5805B3 enumC5805B3) throws Resources.NotFoundException {
        int i = a.f3339a[enumC5805B3.ordinal()];
        if (i == 1) {
            String string2 = this.f3338a.getString(C7279R.string.plaid_error_no_network_connection_content);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 2) {
            String string3 = this.f3338a.getString(C7279R.string.plaid_error_session_expired_content);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i == 3) {
            String string4 = this.f3338a.getString(C7279R.string.plaid_error_initialization_content);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (i == 4) {
            String string5 = this.f3338a.getString(C7279R.string.plaid_error_internal_server_error_try_again_later);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        String string6 = this.f3338a.getString(C7279R.string.plaid_error_fallback_content);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        return string6;
    }
}
