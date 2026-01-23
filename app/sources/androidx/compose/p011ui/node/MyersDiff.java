package androidx.compose.p011ui.node;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* compiled from: MyersDiff.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, m3636d2 = {"Landroidx/compose/ui/node/CenteredArray;", "", "", WebsocketGatewayConstants.DATA_KEY, "constructor-impl", "([I)[I", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "get-impl", "([II)I", "get", "value", "", "set-impl", "([III)V", "set", "getMid-impl", "([I)I", "mid", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
/* renamed from: androidx.compose.ui.node.CenteredArray, reason: use source file name */
/* loaded from: classes.dex */
final class MyersDiff {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m7282constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: getMid-impl, reason: not valid java name */
    private static final int m7284getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final int m7283getimpl(int[] iArr, int i) {
        return iArr[i + m7284getMidimpl(iArr)];
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m7285setimpl(int[] iArr, int i, int i2) {
        iArr[i + m7284getMidimpl(iArr)] = i2;
    }
}
