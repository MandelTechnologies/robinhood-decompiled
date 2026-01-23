package com.robinhood.shared.crypto.p375ui.textinput;

import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoAddressTextInput.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/textinput/AddressVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "highlightCharacterLength", "", "subtleTextColor", "Landroidx/compose/ui/graphics/Color;", "<init>", "(IJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.textinput.AddressVisualTransformation, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoAddressTextInput implements VisualTransformation {
    private final int highlightCharacterLength;
    private final long subtleTextColor;

    public /* synthetic */ CryptoAddressTextInput(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j);
    }

    private CryptoAddressTextInput(int i, long j) {
        this.highlightCharacterLength = i;
        this.subtleTextColor = j;
    }

    public /* synthetic */ CryptoAddressTextInput(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5 : i, j, null);
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        AnnotatedString annotatedString;
        Intrinsics.checkNotNullParameter(text, "text");
        try {
            if (text.length() >= 20) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(text.subSequence(0, this.highlightCharacterLength).toString());
                int iPushStyle = builder.pushStyle(new SpanStyle(this.subtleTextColor, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(text.subSequence(this.highlightCharacterLength, text.length() - this.highlightCharacterLength).toString());
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    builder.append(text.subSequence(text.length() - this.highlightCharacterLength, text.length()).toString());
                    annotatedString = builder.toAnnotatedString();
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            } else {
                annotatedString = text;
            }
            return new TransformedText(annotatedString, OffsetMapping.INSTANCE.getIdentity());
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, new EventMetadata(SentryTeam.CRYPTO, null, null, 6, null), 2, null);
            return new TransformedText(text, OffsetMapping.INSTANCE.getIdentity());
        }
    }
}
