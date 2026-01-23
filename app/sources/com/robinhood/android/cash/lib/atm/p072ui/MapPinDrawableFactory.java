package com.robinhood.android.cash.lib.atm.p072ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.robinhood.android.cash.lib.atm.C10113R;
import com.robinhood.utils.p409ui.view.Drawables;
import java.util.EnumMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MapPinDrawableFactory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/MapPinDrawableFactory;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "bitmaps", "Ljava/util/EnumMap;", "Lcom/robinhood/android/cash/lib/atm/ui/MapPinDrawableFactory$Type;", "Landroid/graphics/Bitmap;", "generateBitmap", "type", "Type", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapPinDrawableFactory {
    public static final int $stable = 8;
    private final EnumMap<Type, Bitmap> bitmaps;
    private final Context context;

    /* JADX WARN: Multi-variable type inference failed */
    public MapPinDrawableFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        List listAsList = ArraysKt.asList(Type.values());
        EnumMap<Type, Bitmap> enumMap = new EnumMap<>(Type.class);
        for (Object obj : listAsList) {
            Drawable drawable = ContextCompat.getDrawable(this.context, ((Type) obj).getDrawableRes());
            Intrinsics.checkNotNull(drawable);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            Intrinsics.checkNotNullExpressionValue(drawableMutate, "apply(...)");
            enumMap.put((EnumMap<Type, Bitmap>) obj, Drawables.toBitmap$default(drawableMutate, 0, 0, null, 7, null));
        }
        this.bitmaps = enumMap;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapPinDrawableFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/MapPinDrawableFactory$Type;", "", "drawableRes", "", "<init>", "(Ljava/lang/String;II)V", "getDrawableRes", "()I", "DEFAULT", "SELECTED", "Companion", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type DEFAULT = new Type("DEFAULT", 0, C10113R.drawable.map_pin_default);
        public static final Type SELECTED = new Type("SELECTED", 1, C10113R.drawable.map_pin_selected);
        private final int drawableRes;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{DEFAULT, SELECTED};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, int i2) {
            this.drawableRes = i2;
        }

        public final int getDrawableRes() {
            return this.drawableRes;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: MapPinDrawableFactory.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/MapPinDrawableFactory$Type$Companion;", "", "<init>", "()V", "fromHighlighted", "Lcom/robinhood/android/cash/lib/atm/ui/MapPinDrawableFactory$Type;", "isHighlighted", "", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Type fromHighlighted(boolean isHighlighted) {
                return isHighlighted ? Type.SELECTED : Type.DEFAULT;
            }
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public final Bitmap generateBitmap(Type type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Bitmap bitmapCopy = ((Bitmap) MapsKt.getValue(this.bitmaps, type2)).copy(Bitmap.Config.ARGB_8888, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCopy, "copy(...)");
        return bitmapCopy;
    }
}
