package com.robinhood.android.gold.sparkle.compose;

import android.graphics.PointF;
import android.util.SizeF;
import com.robinhood.android.gold.sparkle.SparkleManager;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PreviewSparkleManager.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/gold/sparkle/compose/PreviewSparkleManager;", "Lcom/robinhood/android/gold/sparkle/SparkleManager;", "<init>", "()V", "displayDimensions", "Landroid/util/SizeF;", "getDisplayDimensions", "()Landroid/util/SizeF;", "translation", "Lkotlinx/coroutines/flow/Flow;", "Landroid/graphics/PointF;", "getTranslation", "()Lkotlinx/coroutines/flow/Flow;", "lib-gold-sparkle-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PreviewSparkleManager implements SparkleManager {
    public static final PreviewSparkleManager INSTANCE = new PreviewSparkleManager();
    private static final SizeF displayDimensions = new SizeF(1000.0f, 1000.0f);
    private static final Flow<PointF> translation = FlowKt.emptyFlow();
    public static final int $stable = 8;

    private PreviewSparkleManager() {
    }

    @Override // com.robinhood.android.gold.sparkle.SparkleManager
    public SizeF getDisplayDimensions() {
        return displayDimensions;
    }

    @Override // com.robinhood.android.gold.sparkle.SparkleManager
    public Flow<PointF> getTranslation() {
        return translation;
    }
}
