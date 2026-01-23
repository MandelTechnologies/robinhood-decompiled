package com.robinhood.shared.tradeladder.p398ui.ladder.ftux;

import android.content.Context;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericLadderFtuxProgressState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderEducationState;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "contextualBarData", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData;", "getContextualBarData", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/FtuxContextualBarData;", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.ftux.GenericLadderEducationState, reason: use source file name */
/* loaded from: classes12.dex */
public interface GenericLadderFtuxProgressState2 extends GenericLadderFtuxProgressState {
    FtuxContextualBarData getContextualBarData();

    /* compiled from: GenericLadderFtuxProgressState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.ftux.GenericLadderEducationState$DefaultImpls */
    public static final class DefaultImpls {
        public static void prefetchLottie(GenericLadderFtuxProgressState2 genericLadderFtuxProgressState2, Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            GenericLadderFtuxProgressState.DefaultImpls.prefetchLottie(genericLadderFtuxProgressState2, context, z);
        }
    }
}
