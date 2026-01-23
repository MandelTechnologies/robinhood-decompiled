package com.robinhood.android.designsystem.confetti;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.github.jinatonic.confetti.ConfettiManager;
import com.github.jinatonic.confetti.ConfettiSource;
import com.github.jinatonic.confetti.ConfettoGenerator;
import com.github.jinatonic.confetti.confetto.BitmapConfetto;
import com.github.jinatonic.confetti.confetto.Confetto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Confetti.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/confetti/Confetti;", "", "<init>", "()V", "showSnowflakesConfetti", "", "context", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "overlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class Confetti {
    private static final int NUM_SIZE_VARIATIONS = 4;

    public final void showSnowflakesConfetti(Context context, ViewGroup container, DayNightOverlay overlay) throws Resources.NotFoundException {
        DayNightOverlay overlay2 = overlay;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(overlay2, "overlay");
        Resources resources = context.getResources();
        List listListOf = CollectionsKt.listOf((Object[]) new Drawable[]{resources.getDrawable(C13997R.drawable.svg_ic_snowflake_1, null), resources.getDrawable(C13997R.drawable.svg_ic_snowflake_2, null), resources.getDrawable(C13997R.drawable.svg_ic_snowflake_3, null), resources.getDrawable(C13997R.drawable.svg_ic_snowflake_4, null)});
        int size = listListOf.size();
        Random random = new Random(System.currentTimeMillis());
        final int i = size * 4;
        final Bitmap[] bitmapArr = new Bitmap[i];
        int i2 = 0;
        while (i2 < 4) {
            int i3 = 0;
            while (i3 < size) {
                Drawable drawable = (Drawable) listListOf.get(i3);
                float fNextFloat = (random.nextFloat() / 1.33f) + 0.5f;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (drawable.getIntrinsicWidth() * fNextFloat), (int) (drawable.getIntrinsicHeight() * fNextFloat), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (overlay2 == DayNightOverlay.DAY) {
                    drawable.setTint(context.getColor(C20690R.color.mobius_dot_light_day));
                } else if (overlay2 == DayNightOverlay.NIGHT) {
                    drawable.setTint(context.getColor(C20690R.color.mobius_dot_light_night));
                }
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                bitmapArr[(i2 * size) + i3] = bitmapCreateBitmap;
                i3++;
                overlay2 = overlay;
            }
            i2++;
            overlay2 = overlay;
        }
        int width = container.getWidth();
        Bitmap bitmap = bitmapArr[0];
        if (bitmap == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i4 = -bitmap.getWidth();
        new ConfettiManager(context, new ConfettoGenerator() { // from class: com.robinhood.android.designsystem.confetti.Confetti$showSnowflakesConfetti$confettoGenerator$1
            @Override // com.github.jinatonic.confetti.ConfettoGenerator
            public final Confetto generateConfetto(Random random2) {
                Intrinsics.checkNotNullParameter(random2, "random");
                return new BitmapConfetto(bitmapArr[random2.nextInt(i)]);
            }
        }, new ConfettiSource(0, i4, width, i4), container).setEmissionDuration(7000L).setEmissionRate(5.0f).setVelocityX(0.0f, resources.getDimensionPixelOffset(C13997R.dimen.confetti_snowflake_velocity_x_deviation)).setVelocityY(resources.getDimensionPixelOffset(C13997R.dimen.confetti_snowflake_velocity_y), resources.getDimensionPixelOffset(C13997R.dimen.confetti_snowflake_velocity_y_deviation)).setInitialRotation(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE).setRotationalVelocity(180.0f, 90.0f).animate();
    }
}
