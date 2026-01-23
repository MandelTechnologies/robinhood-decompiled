package androidx.compose.material3;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ColorScheme.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B§\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(Bñ\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b'\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b0\u0010/R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b1\u0010/R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b2\u0010/R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b3\u0010/R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b4\u0010/R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b5\u0010/R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b6\u0010/R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b7\u0010/R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b8\u0010/R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b9\u0010/R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b:\u0010/R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b;\u0010/R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b<\u0010/R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b=\u0010/R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b>\u0010/R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b?\u0010/R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b@\u0010/R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\bA\u0010/R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\bB\u0010/R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\bC\u0010/R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\bD\u0010/R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\bE\u0010/R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\bF\u0010/R\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010-\u001a\u0004\bG\u0010/R\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010-\u001a\u0004\bH\u0010/R\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\bI\u0010/R\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\bJ\u0010/R\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010-\u001a\u0004\bK\u0010/R\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\bL\u0010/R\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\bM\u0010/R\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\bN\u0010/R\u001d\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010-\u001a\u0004\bO\u0010/R\u001d\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\bP\u0010/R\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\bQ\u0010/R\u001d\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\bR\u0010/R$\u0010T\u001a\u0004\u0018\u00010S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010Z\u001a\u0004\u0018\u00010S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010U\u001a\u0004\b[\u0010W\"\u0004\b\\\u0010YR$\u0010]\u001a\u0004\u0018\u00010S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010U\u001a\u0004\b^\u0010W\"\u0004\b_\u0010YR$\u0010a\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010g\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010b\u001a\u0004\bh\u0010d\"\u0004\bi\u0010fR$\u0010j\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010b\u001a\u0004\bk\u0010d\"\u0004\bl\u0010fR*\u0010n\u001a\u0004\u0018\u00010m8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bn\u0010o\u0012\u0004\bt\u0010u\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR*\u0010v\u001a\u0004\u0018\u00010m8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bv\u0010o\u0012\u0004\by\u0010u\u001a\u0004\bw\u0010q\"\u0004\bx\u0010sR*\u0010z\u001a\u0004\u0018\u00010m8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bz\u0010o\u0012\u0004\b}\u0010u\u001a\u0004\b{\u0010q\"\u0004\b|\u0010sR,\u0010~\u001a\u0004\u0018\u00010m8\u0000@\u0000X\u0080\u000e¢\u0006\u001a\n\u0004\b~\u0010o\u0012\u0005\b\u0081\u0001\u0010u\u001a\u0004\b\u007f\u0010q\"\u0005\b\u0080\u0001\u0010sR,\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R3\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001f\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u0012\u0005\b\u0090\u0001\u0010u\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R,\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R,\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R,\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R,\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R,\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R,\u0010µ\u0001\u001a\u0005\u0018\u00010´\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R,\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R,\u0010Â\u0001\u001a\u0005\u0018\u00010»\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010½\u0001\u001a\u0006\bÃ\u0001\u0010¿\u0001\"\u0006\bÄ\u0001\u0010Á\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Å\u0001"}, m3636d2 = {"Landroidx/compose/material3/ColorScheme;", "", "Landroidx/compose/ui/graphics/Color;", InstantRetirementSplashScreen.PrimaryButtonTag, "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", InstantRetirementSplashScreen.SecondaryButtonTag, "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "J", "getPrimary-0d7_KjU", "()J", "getOnPrimary-0d7_KjU", "getPrimaryContainer-0d7_KjU", "getOnPrimaryContainer-0d7_KjU", "getInversePrimary-0d7_KjU", "getSecondary-0d7_KjU", "getOnSecondary-0d7_KjU", "getSecondaryContainer-0d7_KjU", "getOnSecondaryContainer-0d7_KjU", "getTertiary-0d7_KjU", "getOnTertiary-0d7_KjU", "getTertiaryContainer-0d7_KjU", "getOnTertiaryContainer-0d7_KjU", "getBackground-0d7_KjU", "getOnBackground-0d7_KjU", "getSurface-0d7_KjU", "getOnSurface-0d7_KjU", "getSurfaceVariant-0d7_KjU", "getOnSurfaceVariant-0d7_KjU", "getSurfaceTint-0d7_KjU", "getInverseSurface-0d7_KjU", "getInverseOnSurface-0d7_KjU", "getError-0d7_KjU", "getOnError-0d7_KjU", "getErrorContainer-0d7_KjU", "getOnErrorContainer-0d7_KjU", "getOutline-0d7_KjU", "getOutlineVariant-0d7_KjU", "getScrim-0d7_KjU", "getSurfaceBright-0d7_KjU", "getSurfaceDim-0d7_KjU", "getSurfaceContainer-0d7_KjU", "getSurfaceContainerHigh-0d7_KjU", "getSurfaceContainerHighest-0d7_KjU", "getSurfaceContainerLow-0d7_KjU", "getSurfaceContainerLowest-0d7_KjU", "Landroidx/compose/material3/ButtonColors;", "defaultButtonColorsCached", "Landroidx/compose/material3/ButtonColors;", "getDefaultButtonColorsCached$material3_release", "()Landroidx/compose/material3/ButtonColors;", "setDefaultButtonColorsCached$material3_release", "(Landroidx/compose/material3/ButtonColors;)V", "defaultOutlinedButtonColorsCached", "getDefaultOutlinedButtonColorsCached$material3_release", "setDefaultOutlinedButtonColorsCached$material3_release", "defaultTextButtonColorsCached", "getDefaultTextButtonColorsCached$material3_release", "setDefaultTextButtonColorsCached$material3_release", "Landroidx/compose/material3/CardColors;", "defaultCardColorsCached", "Landroidx/compose/material3/CardColors;", "getDefaultCardColorsCached$material3_release", "()Landroidx/compose/material3/CardColors;", "setDefaultCardColorsCached$material3_release", "(Landroidx/compose/material3/CardColors;)V", "defaultElevatedCardColorsCached", "getDefaultElevatedCardColorsCached$material3_release", "setDefaultElevatedCardColorsCached$material3_release", "defaultOutlinedCardColorsCached", "getDefaultOutlinedCardColorsCached$material3_release", "setDefaultOutlinedCardColorsCached$material3_release", "Landroidx/compose/material3/TopAppBarColors;", "defaultTopAppBarColorsCached", "Landroidx/compose/material3/TopAppBarColors;", "getDefaultTopAppBarColorsCached$material3_release", "()Landroidx/compose/material3/TopAppBarColors;", "setDefaultTopAppBarColorsCached$material3_release", "(Landroidx/compose/material3/TopAppBarColors;)V", "getDefaultTopAppBarColorsCached$material3_release$annotations", "()V", "defaultCenterAlignedTopAppBarColorsCached", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release", "setDefaultCenterAlignedTopAppBarColorsCached$material3_release", "getDefaultCenterAlignedTopAppBarColorsCached$material3_release$annotations", "defaultMediumTopAppBarColorsCached", "getDefaultMediumTopAppBarColorsCached$material3_release", "setDefaultMediumTopAppBarColorsCached$material3_release", "getDefaultMediumTopAppBarColorsCached$material3_release$annotations", "defaultLargeTopAppBarColorsCached", "getDefaultLargeTopAppBarColorsCached$material3_release", "setDefaultLargeTopAppBarColorsCached$material3_release", "getDefaultLargeTopAppBarColorsCached$material3_release$annotations", "Landroidx/compose/material3/CheckboxColors;", "defaultCheckboxColorsCached", "Landroidx/compose/material3/CheckboxColors;", "getDefaultCheckboxColorsCached$material3_release", "()Landroidx/compose/material3/CheckboxColors;", "setDefaultCheckboxColorsCached$material3_release", "(Landroidx/compose/material3/CheckboxColors;)V", "Landroidx/compose/material3/DatePickerColors;", "defaultDatePickerColorsCached", "Landroidx/compose/material3/DatePickerColors;", "getDefaultDatePickerColorsCached$material3_release", "()Landroidx/compose/material3/DatePickerColors;", "setDefaultDatePickerColorsCached$material3_release", "(Landroidx/compose/material3/DatePickerColors;)V", "getDefaultDatePickerColorsCached$material3_release$annotations", "Landroidx/compose/material3/IconButtonColors;", "defaultIconButtonColorsCached", "Landroidx/compose/material3/IconButtonColors;", "getDefaultIconButtonColorsCached$material3_release", "()Landroidx/compose/material3/IconButtonColors;", "setDefaultIconButtonColorsCached$material3_release", "(Landroidx/compose/material3/IconButtonColors;)V", "Landroidx/compose/material3/MenuItemColors;", "defaultMenuItemColorsCached", "Landroidx/compose/material3/MenuItemColors;", "getDefaultMenuItemColorsCached$material3_release", "()Landroidx/compose/material3/MenuItemColors;", "setDefaultMenuItemColorsCached$material3_release", "(Landroidx/compose/material3/MenuItemColors;)V", "Landroidx/compose/material3/NavigationBarItemColors;", "defaultNavigationBarItemColorsCached", "Landroidx/compose/material3/NavigationBarItemColors;", "getDefaultNavigationBarItemColorsCached$material3_release", "()Landroidx/compose/material3/NavigationBarItemColors;", "setDefaultNavigationBarItemColorsCached$material3_release", "(Landroidx/compose/material3/NavigationBarItemColors;)V", "Landroidx/compose/material3/RadioButtonColors;", "defaultRadioButtonColorsCached", "Landroidx/compose/material3/RadioButtonColors;", "getDefaultRadioButtonColorsCached$material3_release", "()Landroidx/compose/material3/RadioButtonColors;", "setDefaultRadioButtonColorsCached$material3_release", "(Landroidx/compose/material3/RadioButtonColors;)V", "Landroidx/compose/material3/SliderColors;", "defaultSliderColorsCached", "Landroidx/compose/material3/SliderColors;", "getDefaultSliderColorsCached$material3_release", "()Landroidx/compose/material3/SliderColors;", "setDefaultSliderColorsCached$material3_release", "(Landroidx/compose/material3/SliderColors;)V", "Landroidx/compose/material3/SwitchColors;", "defaultSwitchColorsCached", "Landroidx/compose/material3/SwitchColors;", "getDefaultSwitchColorsCached$material3_release", "()Landroidx/compose/material3/SwitchColors;", "setDefaultSwitchColorsCached$material3_release", "(Landroidx/compose/material3/SwitchColors;)V", "Landroidx/compose/material3/TextFieldColors;", "defaultOutlinedTextFieldColorsCached", "Landroidx/compose/material3/TextFieldColors;", "getDefaultOutlinedTextFieldColorsCached$material3_release", "()Landroidx/compose/material3/TextFieldColors;", "setDefaultOutlinedTextFieldColorsCached$material3_release", "(Landroidx/compose/material3/TextFieldColors;)V", "defaultTextFieldColorsCached", "getDefaultTextFieldColorsCached$material3_release", "setDefaultTextFieldColorsCached$material3_release", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class ColorScheme {
    private final long background;
    private ButtonColors defaultButtonColorsCached;
    private CardColors defaultCardColorsCached;
    private TopAppBarColors defaultCenterAlignedTopAppBarColorsCached;
    private CheckboxColors defaultCheckboxColorsCached;
    private DatePickerColors defaultDatePickerColorsCached;
    private CardColors defaultElevatedCardColorsCached;
    private IconButton3 defaultIconButtonColorsCached;
    private TopAppBarColors defaultLargeTopAppBarColorsCached;
    private TopAppBarColors defaultMediumTopAppBarColorsCached;
    private MenuItemColors defaultMenuItemColorsCached;
    private NavigationBarItemColors defaultNavigationBarItemColorsCached;
    private ButtonColors defaultOutlinedButtonColorsCached;
    private CardColors defaultOutlinedCardColorsCached;
    private TextFieldColors defaultOutlinedTextFieldColorsCached;
    private RadioButtonColors defaultRadioButtonColorsCached;
    private SliderColors defaultSliderColorsCached;
    private SwitchColors defaultSwitchColorsCached;
    private ButtonColors defaultTextButtonColorsCached;
    private TextFieldColors defaultTextFieldColorsCached;
    private TopAppBarColors defaultTopAppBarColorsCached;
    private final long error;
    private final long errorContainer;
    private final long inverseOnSurface;
    private final long inversePrimary;
    private final long inverseSurface;
    private final long onBackground;
    private final long onError;
    private final long onErrorContainer;
    private final long onPrimary;
    private final long onPrimaryContainer;
    private final long onSecondary;
    private final long onSecondaryContainer;
    private final long onSurface;
    private final long onSurfaceVariant;
    private final long onTertiary;
    private final long onTertiaryContainer;
    private final long outline;
    private final long outlineVariant;
    private final long primary;
    private final long primaryContainer;
    private final long scrim;
    private final long secondary;
    private final long secondaryContainer;
    private final long surface;
    private final long surfaceBright;
    private final long surfaceContainer;
    private final long surfaceContainerHigh;
    private final long surfaceContainerHighest;
    private final long surfaceContainerLow;
    private final long surfaceContainerLowest;
    private final long surfaceDim;
    private final long surfaceTint;
    private final long surfaceVariant;
    private final long tertiary;
    private final long tertiaryContainer;

    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36);
    }

    @Deprecated
    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
    }

    private ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        this.primary = j;
        this.onPrimary = j2;
        this.primaryContainer = j3;
        this.onPrimaryContainer = j4;
        this.inversePrimary = j5;
        this.secondary = j6;
        this.onSecondary = j7;
        this.secondaryContainer = j8;
        this.onSecondaryContainer = j9;
        this.tertiary = j10;
        this.onTertiary = j11;
        this.tertiaryContainer = j12;
        this.onTertiaryContainer = j13;
        this.background = j14;
        this.onBackground = j15;
        this.surface = j16;
        this.onSurface = j17;
        this.surfaceVariant = j18;
        this.onSurfaceVariant = j19;
        this.surfaceTint = j20;
        this.inverseSurface = j21;
        this.inverseOnSurface = j22;
        this.error = j23;
        this.onError = j24;
        this.errorContainer = j25;
        this.onErrorContainer = j26;
        this.outline = j27;
        this.outlineVariant = j28;
        this.scrim = j29;
        this.surfaceBright = j30;
        this.surfaceDim = j31;
        this.surfaceContainer = j32;
        this.surfaceContainerHigh = j33;
        this.surfaceContainerHighest = j34;
        this.surfaceContainerLow = j35;
        this.surfaceContainerLowest = j36;
    }

    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary() {
        return this.primary;
    }

    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimary() {
        return this.onPrimary;
    }

    /* renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimaryContainer() {
        return this.primaryContainer;
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    /* renamed from: getInversePrimary-0d7_KjU, reason: not valid java name and from getter */
    public final long getInversePrimary() {
        return this.inversePrimary;
    }

    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondary() {
        return this.secondary;
    }

    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondary() {
        return this.onSecondary;
    }

    /* renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondaryContainer() {
        return this.secondaryContainer;
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    /* renamed from: getTertiary-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiary() {
        return this.tertiary;
    }

    /* renamed from: getOnTertiary-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiary() {
        return this.onTertiary;
    }

    /* renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    /* renamed from: getSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurface() {
        return this.surface;
    }

    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSurface() {
        return this.onSurface;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceVariant() {
        return this.surfaceVariant;
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    /* renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceTint() {
        return this.surfaceTint;
    }

    /* renamed from: getInverseSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getInverseSurface() {
        return this.inverseSurface;
    }

    /* renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name and from getter */
    public final long getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
    public final long getError() {
        return this.error;
    }

    /* renamed from: getOnError-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnError() {
        return this.onError;
    }

    /* renamed from: getErrorContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getErrorContainer() {
        return this.errorContainer;
    }

    /* renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnErrorContainer() {
        return this.onErrorContainer;
    }

    /* renamed from: getOutline-0d7_KjU, reason: not valid java name and from getter */
    public final long getOutline() {
        return this.outline;
    }

    /* renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name and from getter */
    public final long getOutlineVariant() {
        return this.outlineVariant;
    }

    /* renamed from: getScrim-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrim() {
        return this.scrim;
    }

    /* renamed from: getSurfaceBright-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceBright() {
        return this.surfaceBright;
    }

    /* renamed from: getSurfaceDim-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceDim() {
        return this.surfaceDim;
    }

    /* renamed from: getSurfaceContainer-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainer() {
        return this.surfaceContainer;
    }

    /* renamed from: getSurfaceContainerHigh-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerHigh() {
        return this.surfaceContainerHigh;
    }

    /* renamed from: getSurfaceContainerHighest-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerHighest() {
        return this.surfaceContainerHighest;
    }

    /* renamed from: getSurfaceContainerLow-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerLow() {
        return this.surfaceContainerLow;
    }

    /* renamed from: getSurfaceContainerLowest-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceContainerLowest() {
        return this.surfaceContainerLowest;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        Color.Companion companion = Color.INSTANCE;
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, companion.m6726getUnspecified0d7_KjU(), companion.m6726getUnspecified0d7_KjU(), companion.m6726getUnspecified0d7_KjU(), companion.m6726getUnspecified0d7_KjU(), companion.m6726getUnspecified0d7_KjU(), companion.m6726getUnspecified0d7_KjU(), companion.m6726getUnspecified0d7_KjU(), null);
    }

    public String toString() {
        return "ColorScheme(primary=" + ((Object) Color.m6714toStringimpl(this.primary)) + "onPrimary=" + ((Object) Color.m6714toStringimpl(this.onPrimary)) + "primaryContainer=" + ((Object) Color.m6714toStringimpl(this.primaryContainer)) + "onPrimaryContainer=" + ((Object) Color.m6714toStringimpl(this.onPrimaryContainer)) + "inversePrimary=" + ((Object) Color.m6714toStringimpl(this.inversePrimary)) + "secondary=" + ((Object) Color.m6714toStringimpl(this.secondary)) + "onSecondary=" + ((Object) Color.m6714toStringimpl(this.onSecondary)) + "secondaryContainer=" + ((Object) Color.m6714toStringimpl(this.secondaryContainer)) + "onSecondaryContainer=" + ((Object) Color.m6714toStringimpl(this.onSecondaryContainer)) + "tertiary=" + ((Object) Color.m6714toStringimpl(this.tertiary)) + "onTertiary=" + ((Object) Color.m6714toStringimpl(this.onTertiary)) + "tertiaryContainer=" + ((Object) Color.m6714toStringimpl(this.tertiaryContainer)) + "onTertiaryContainer=" + ((Object) Color.m6714toStringimpl(this.onTertiaryContainer)) + "background=" + ((Object) Color.m6714toStringimpl(this.background)) + "onBackground=" + ((Object) Color.m6714toStringimpl(this.onBackground)) + "surface=" + ((Object) Color.m6714toStringimpl(this.surface)) + "onSurface=" + ((Object) Color.m6714toStringimpl(this.onSurface)) + "surfaceVariant=" + ((Object) Color.m6714toStringimpl(this.surfaceVariant)) + "onSurfaceVariant=" + ((Object) Color.m6714toStringimpl(this.onSurfaceVariant)) + "surfaceTint=" + ((Object) Color.m6714toStringimpl(this.surfaceTint)) + "inverseSurface=" + ((Object) Color.m6714toStringimpl(this.inverseSurface)) + "inverseOnSurface=" + ((Object) Color.m6714toStringimpl(this.inverseOnSurface)) + "error=" + ((Object) Color.m6714toStringimpl(this.error)) + "onError=" + ((Object) Color.m6714toStringimpl(this.onError)) + "errorContainer=" + ((Object) Color.m6714toStringimpl(this.errorContainer)) + "onErrorContainer=" + ((Object) Color.m6714toStringimpl(this.onErrorContainer)) + "outline=" + ((Object) Color.m6714toStringimpl(this.outline)) + "outlineVariant=" + ((Object) Color.m6714toStringimpl(this.outlineVariant)) + "scrim=" + ((Object) Color.m6714toStringimpl(this.scrim)) + "surfaceBright=" + ((Object) Color.m6714toStringimpl(this.surfaceBright)) + "surfaceDim=" + ((Object) Color.m6714toStringimpl(this.surfaceDim)) + "surfaceContainer=" + ((Object) Color.m6714toStringimpl(this.surfaceContainer)) + "surfaceContainerHigh=" + ((Object) Color.m6714toStringimpl(this.surfaceContainerHigh)) + "surfaceContainerHighest=" + ((Object) Color.m6714toStringimpl(this.surfaceContainerHighest)) + "surfaceContainerLow=" + ((Object) Color.m6714toStringimpl(this.surfaceContainerLow)) + "surfaceContainerLowest=" + ((Object) Color.m6714toStringimpl(this.surfaceContainerLowest)) + ')';
    }

    /* renamed from: getDefaultButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultButtonColorsCached() {
        return this.defaultButtonColorsCached;
    }

    public final void setDefaultButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultButtonColorsCached = buttonColors;
    }

    /* renamed from: getDefaultOutlinedButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultOutlinedButtonColorsCached() {
        return this.defaultOutlinedButtonColorsCached;
    }

    public final void setDefaultOutlinedButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultOutlinedButtonColorsCached = buttonColors;
    }

    /* renamed from: getDefaultTextButtonColorsCached$material3_release, reason: from getter */
    public final ButtonColors getDefaultTextButtonColorsCached() {
        return this.defaultTextButtonColorsCached;
    }

    public final void setDefaultTextButtonColorsCached$material3_release(ButtonColors buttonColors) {
        this.defaultTextButtonColorsCached = buttonColors;
    }

    /* renamed from: getDefaultCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultCardColorsCached() {
        return this.defaultCardColorsCached;
    }

    public final void setDefaultCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultCardColorsCached = cardColors;
    }

    /* renamed from: getDefaultElevatedCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultElevatedCardColorsCached() {
        return this.defaultElevatedCardColorsCached;
    }

    public final void setDefaultElevatedCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultElevatedCardColorsCached = cardColors;
    }

    /* renamed from: getDefaultOutlinedCardColorsCached$material3_release, reason: from getter */
    public final CardColors getDefaultOutlinedCardColorsCached() {
        return this.defaultOutlinedCardColorsCached;
    }

    public final void setDefaultOutlinedCardColorsCached$material3_release(CardColors cardColors) {
        this.defaultOutlinedCardColorsCached = cardColors;
    }

    /* renamed from: getDefaultTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultTopAppBarColorsCached() {
        return this.defaultTopAppBarColorsCached;
    }

    public final void setDefaultTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultTopAppBarColorsCached = topAppBarColors;
    }

    /* renamed from: getDefaultCenterAlignedTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColorsCached() {
        return this.defaultCenterAlignedTopAppBarColorsCached;
    }

    public final void setDefaultCenterAlignedTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultCenterAlignedTopAppBarColorsCached = topAppBarColors;
    }

    /* renamed from: getDefaultMediumTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultMediumTopAppBarColorsCached() {
        return this.defaultMediumTopAppBarColorsCached;
    }

    public final void setDefaultMediumTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultMediumTopAppBarColorsCached = topAppBarColors;
    }

    /* renamed from: getDefaultLargeTopAppBarColorsCached$material3_release, reason: from getter */
    public final TopAppBarColors getDefaultLargeTopAppBarColorsCached() {
        return this.defaultLargeTopAppBarColorsCached;
    }

    public final void setDefaultLargeTopAppBarColorsCached$material3_release(TopAppBarColors topAppBarColors) {
        this.defaultLargeTopAppBarColorsCached = topAppBarColors;
    }

    /* renamed from: getDefaultCheckboxColorsCached$material3_release, reason: from getter */
    public final CheckboxColors getDefaultCheckboxColorsCached() {
        return this.defaultCheckboxColorsCached;
    }

    public final void setDefaultCheckboxColorsCached$material3_release(CheckboxColors checkboxColors) {
        this.defaultCheckboxColorsCached = checkboxColors;
    }

    /* renamed from: getDefaultDatePickerColorsCached$material3_release, reason: from getter */
    public final DatePickerColors getDefaultDatePickerColorsCached() {
        return this.defaultDatePickerColorsCached;
    }

    public final void setDefaultDatePickerColorsCached$material3_release(DatePickerColors datePickerColors) {
        this.defaultDatePickerColorsCached = datePickerColors;
    }

    /* renamed from: getDefaultIconButtonColorsCached$material3_release, reason: from getter */
    public final IconButton3 getDefaultIconButtonColorsCached() {
        return this.defaultIconButtonColorsCached;
    }

    public final void setDefaultIconButtonColorsCached$material3_release(IconButton3 iconButton3) {
        this.defaultIconButtonColorsCached = iconButton3;
    }

    /* renamed from: getDefaultMenuItemColorsCached$material3_release, reason: from getter */
    public final MenuItemColors getDefaultMenuItemColorsCached() {
        return this.defaultMenuItemColorsCached;
    }

    public final void setDefaultMenuItemColorsCached$material3_release(MenuItemColors menuItemColors) {
        this.defaultMenuItemColorsCached = menuItemColors;
    }

    /* renamed from: getDefaultNavigationBarItemColorsCached$material3_release, reason: from getter */
    public final NavigationBarItemColors getDefaultNavigationBarItemColorsCached() {
        return this.defaultNavigationBarItemColorsCached;
    }

    public final void setDefaultNavigationBarItemColorsCached$material3_release(NavigationBarItemColors navigationBarItemColors) {
        this.defaultNavigationBarItemColorsCached = navigationBarItemColors;
    }

    /* renamed from: getDefaultRadioButtonColorsCached$material3_release, reason: from getter */
    public final RadioButtonColors getDefaultRadioButtonColorsCached() {
        return this.defaultRadioButtonColorsCached;
    }

    public final void setDefaultRadioButtonColorsCached$material3_release(RadioButtonColors radioButtonColors) {
        this.defaultRadioButtonColorsCached = radioButtonColors;
    }

    /* renamed from: getDefaultSliderColorsCached$material3_release, reason: from getter */
    public final SliderColors getDefaultSliderColorsCached() {
        return this.defaultSliderColorsCached;
    }

    public final void setDefaultSliderColorsCached$material3_release(SliderColors sliderColors) {
        this.defaultSliderColorsCached = sliderColors;
    }

    /* renamed from: getDefaultSwitchColorsCached$material3_release, reason: from getter */
    public final SwitchColors getDefaultSwitchColorsCached() {
        return this.defaultSwitchColorsCached;
    }

    public final void setDefaultSwitchColorsCached$material3_release(SwitchColors switchColors) {
        this.defaultSwitchColorsCached = switchColors;
    }

    /* renamed from: getDefaultOutlinedTextFieldColorsCached$material3_release, reason: from getter */
    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    public final void setDefaultOutlinedTextFieldColorsCached$material3_release(TextFieldColors textFieldColors) {
        this.defaultOutlinedTextFieldColorsCached = textFieldColors;
    }

    /* renamed from: getDefaultTextFieldColorsCached$material3_release, reason: from getter */
    public final TextFieldColors getDefaultTextFieldColorsCached() {
        return this.defaultTextFieldColorsCached;
    }

    public final void setDefaultTextFieldColorsCached$material3_release(TextFieldColors textFieldColors) {
        this.defaultTextFieldColorsCached = textFieldColors;
    }
}
