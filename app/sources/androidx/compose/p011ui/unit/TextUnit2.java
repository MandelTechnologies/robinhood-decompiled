package androidx.compose.p011ui.unit;

import androidx.compose.p011ui.util.MathHelpers;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TextUnit.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001a \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001a\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001e\u0010\u001f\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\"\u001e\u0010\u001f\u001a\u00020\u0004*\u00020 8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\"\u001a\u0004\b\u001b\u0010!\"\u001e\u0010%\u001a\u00020\u0004*\u00020 8FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010!\"\u001e\u0010\u001f\u001a\u00020\u0004*\u00020&8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010(\u001a\u0004\b\u001b\u0010'\"\u001e\u0010%\u001a\u00020\u0004*\u00020&8FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010(\u001a\u0004\b#\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m3636d2 = {"", "value", "Landroidx/compose/ui/unit/TextUnitType;", "type", "Landroidx/compose/ui/unit/TextUnit;", "TextUnit-anM5pPY", "(FJ)J", "TextUnit", "", "unitType", "v", "pack", "(JF)J", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "checkArithmetic--R2X_6o", "(J)V", "checkArithmetic", "b", "checkArithmetic-NB67dxo", "(JJ)V", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "lerp", "getSp", "(F)J", "getSp$annotations", "(F)V", "sp", "", "(D)J", "(D)V", "getEm", "getEm$annotations", "em", "", "(I)J", "(I)V", "ui-unit_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.unit.TextUnitKt, reason: use source file name */
/* loaded from: classes.dex */
public final class TextUnit2 {
    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m8081TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    @PublishedApi
    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m8082checkArithmeticR2X_6o(long j) {
        if (TextUnit.m8072getRawTypeimpl(j) == 0) {
            InlineClassHelper6.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    @PublishedApi
    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m8083checkArithmeticNB67dxo(long j, long j2) {
        if (!((TextUnit.m8072getRawTypeimpl(j) == 0 || TextUnit.m8072getRawTypeimpl(j2) == 0) ? false : true)) {
            InlineClassHelper6.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnit3.m8088equalsimpl0(TextUnit.m8073getTypeUIouoOA(j), TextUnit.m8073getTypeUIouoOA(j2))) {
            return;
        }
        InlineClassHelper6.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnit3.m8090toStringimpl(TextUnit.m8073getTypeUIouoOA(j))) + " and " + ((Object) TextUnit3.m8090toStringimpl(TextUnit.m8073getTypeUIouoOA(j2))));
    }

    public static final long getSp(float f) {
        return pack(4294967296L, f);
    }

    public static final long getSp(double d) {
        return pack(4294967296L, (float) d);
    }

    public static final long getEm(double d) {
        return pack(8589934592L, (float) d);
    }

    public static final long getSp(int i) {
        return pack(4294967296L, i);
    }

    public static final long getEm(int i) {
        return pack(8589934592L, i);
    }

    @PublishedApi
    public static final long pack(long j, float f) {
        return TextUnit.m8069constructorimpl(j | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m8084lerpC3pnCVY(long j, long j2, float f) {
        m8083checkArithmeticNB67dxo(j, j2);
        return pack(TextUnit.m8072getRawTypeimpl(j), MathHelpers.lerp(TextUnit.m8074getValueimpl(j), TextUnit.m8074getValueimpl(j2), f));
    }
}
