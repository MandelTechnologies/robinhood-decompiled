package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.Document;
import com.robinhood.shared.app.type.AppType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhcUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"region", "", "Lcom/robinhood/shared/app/type/AppType;", "getRegion", "(Lcom/robinhood/shared/app/type/AppType;)Ljava/lang/String;", "edocType", "Lcom/robinhood/models/db/Document$Category;", "getEdocType", "(Lcom/robinhood/shared/app/type/AppType;)Lcom/robinhood/models/db/Document$Category;", "lib-store-identi_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.RhcUtilsKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class RhcUtils {

    /* compiled from: RhcUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.RhcUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.TRADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getRegion(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
        if (i == 1) {
            return "rhc";
        }
        if (i == 2) {
            return "rhc_eu";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("NCW documents are not supported");
    }

    public static final Document.Category getEdocType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
        if (i == 1) {
            return Document.Category.RHC_STATEMENT;
        }
        if (i == 2) {
            return Document.Category.RHC_EU_STATEMENT;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("NCW documents are not supported");
    }
}
