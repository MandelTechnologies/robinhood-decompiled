package com.robinhood.android.designsystem.style;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScarletOverlays.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "Lcom/robinhood/scarlet/ScarletOverlay;", "", "overlayAttributeId", "", "<init>", "(Ljava/lang/String;II)V", "POSITIVE", "NEGATIVE", "styleReference", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "priority", "getPriority", "()I", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DirectionOverlay implements ScarletOverlay {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DirectionOverlay[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final ThemedResourceReference<StyleResource> styleReference;
    public static final DirectionOverlay POSITIVE = new DirectionOverlay("POSITIVE", 0, C20690R.attr.positiveTheme);
    public static final DirectionOverlay NEGATIVE = new DirectionOverlay("NEGATIVE", 1, C20690R.attr.negativeTheme);

    private static final /* synthetic */ DirectionOverlay[] $values() {
        return new DirectionOverlay[]{POSITIVE, NEGATIVE};
    }

    public static EnumEntries<DirectionOverlay> getEntries() {
        return $ENTRIES;
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public int getPriority() {
        return 1000;
    }

    private DirectionOverlay(String str, int i, int i2) {
        this.styleReference = new ThemedResourceReference<>(ResourceType.STYLE.INSTANCE, i2);
    }

    static {
        DirectionOverlay[] directionOverlayArr$values = $values();
        $VALUES = directionOverlayArr$values;
        $ENTRIES = EnumEntries2.enumEntries(directionOverlayArr$values);
        INSTANCE = new Companion(null);
    }

    @Override // com.robinhood.scarlet.ScarletOverlay
    public ThemedResourceReference<StyleResource> getStyleReference() {
        return this.styleReference;
    }

    /* compiled from: ScarletOverlays.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/style/DirectionOverlay$Companion;", "", "<init>", "()V", "fromSignOf", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "amount", "Ljava/math/BigDecimal;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DirectionOverlay fromSignOf(BigDecimal amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            return BigDecimals7.isNegative(amount) ? DirectionOverlay.NEGATIVE : DirectionOverlay.POSITIVE;
        }
    }

    public static DirectionOverlay valueOf(String str) {
        return (DirectionOverlay) Enum.valueOf(DirectionOverlay.class, str);
    }

    public static DirectionOverlay[] values() {
        return (DirectionOverlay[]) $VALUES.clone();
    }
}
