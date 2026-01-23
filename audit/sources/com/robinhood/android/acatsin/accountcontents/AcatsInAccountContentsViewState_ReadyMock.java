package com.robinhood.android.acatsin.accountcontents;

import android.graphics.Bitmap;
import com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsViewState;
import com.robinhood.hammer.core.internal.RhGenerated;
import com.robinhood.models.acats.p299db.bonfire.AccountContentItem;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAccountContentItem;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: AcatsInAccountContentsViewState_ReadyMock.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState_ReadyMock;", "", "<init>", "()V", "generate", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState$Ready;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInAccountContentsViewState_ReadyMock {
    public static final int $stable = 0;
    public static final AcatsInAccountContentsViewState_ReadyMock INSTANCE = new AcatsInAccountContentsViewState_ReadyMock();

    private AcatsInAccountContentsViewState_ReadyMock() {
    }

    public final AcatsInAccountContentsViewState.Ready generate() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
        ApiAccountContentItem.FlowType flowType = ApiAccountContentItem.FlowType.PARTIAL;
        return new AcatsInAccountContentsViewState.Ready("-------- --------------- ----------- -------------------- ---------", bitmapCreateBitmap, CollectionsKt.listOf(new AccountContentItem("-------- --------------- ----------- -------------------- ---------", flowType)), CollectionsKt.listOf(new AccountContentItem("-------- --------------- ----------- -------------------- ---------", flowType)), CollectionsKt.listOf(ApiAcatsAccountContentsResponse.SupportedContentType.CASH), "-------- --------------- ----------- -------------------- ---------");
    }
}
