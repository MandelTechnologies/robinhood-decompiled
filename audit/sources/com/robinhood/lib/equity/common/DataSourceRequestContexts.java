package com.robinhood.lib.equity.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.RuntimeInfo;
import microgram.datasource.DataSourceRequestContext;

/* compiled from: DataSourceRequestContexts.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"getBrokebackUrlForEnvironment", "", "Lmicrogram/datasource/DataSourceRequestContext;", "endpoint", "lib-equity-store"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.robinhood.lib.equity.common.DataSourceRequestContextsKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class DataSourceRequestContexts {

    /* compiled from: DataSourceRequestContexts.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.lib.equity.common.DataSourceRequestContextsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RuntimeInfo.ApiEnvironment.values().length];
            try {
                iArr[RuntimeInfo.ApiEnvironment.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RuntimeInfo.ApiEnvironment.APOLLO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getBrokebackUrlForEnvironment(DataSourceRequestContext dataSourceRequestContext, String endpoint) {
        Intrinsics.checkNotNullParameter(dataSourceRequestContext, "<this>");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        throw null;
    }
}
