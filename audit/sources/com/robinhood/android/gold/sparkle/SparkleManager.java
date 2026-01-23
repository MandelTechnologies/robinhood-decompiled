package com.robinhood.android.gold.sparkle;

import android.graphics.PointF;
import android.util.SizeF;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SparkleManager.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gold/sparkle/SparkleManager;", "", "displayDimensions", "Landroid/util/SizeF;", "getDisplayDimensions", "()Landroid/util/SizeF;", "translation", "Lkotlinx/coroutines/flow/Flow;", "Landroid/graphics/PointF;", "getTranslation", "()Lkotlinx/coroutines/flow/Flow;", "lib-gold-sparkle_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface SparkleManager {
    SizeF getDisplayDimensions();

    Flow<PointF> getTranslation();
}
