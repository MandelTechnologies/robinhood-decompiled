package com.robinhood.android.challenge.extension;

import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import com.robinhood.models.api.Challenge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Breadcrumbs.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"createChallengeBreadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "source", "", "username", "challengeType", "Lcom/robinhood/models/api/Challenge$Type;", "experimentEnabled", "", "breadcrumbType", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", "feature-challenge_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.challenge.extension.BreadcrumbsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Breadcrumbs {
    public static /* synthetic */ SupportBreadcrumb createChallengeBreadcrumb$default(String str, String str2, Challenge.Type type2, boolean z, SupportBreadcrumbType supportBreadcrumbType, int i, Object obj) {
        if ((i & 16) != 0) {
            supportBreadcrumbType = SupportBreadcrumbType.RECOVERY_AUTHENTICATOR_RESET;
        }
        return createChallengeBreadcrumb(str, str2, type2, z, supportBreadcrumbType);
    }

    public static final SupportBreadcrumb createChallengeBreadcrumb(String source, String str, Challenge.Type type2, boolean z, SupportBreadcrumbType breadcrumbType) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(breadcrumbType, "breadcrumbType");
        if (!z) {
            return null;
        }
        Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to("username", str), Tuples4.m3642to("challenge_type", type2 != null ? type2.getServerValue() : null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapMapOf.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new SupportBreadcrumb(breadcrumbType, linkedHashMap, source);
    }
}
