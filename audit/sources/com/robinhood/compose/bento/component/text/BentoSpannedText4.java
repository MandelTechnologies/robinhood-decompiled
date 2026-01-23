package com.robinhood.compose.bento.component.text;

import android.text.Spanned;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: BentoSpannedText.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jg\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/text/SpannedTextProvider;", "", "SpannedText", "", "spanned", "Landroid/text/Spanned;", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "linkColor", "textAppearance", "", "gravity", "maxLines", "autoSizeTextType", "onClick", "Lkotlin/Function0;", "SpannedText-gPmlwdY", "(Landroid/text/Spanned;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;ILjava/lang/Integer;IILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.text.SpannedTextProvider, reason: use source file name */
/* loaded from: classes15.dex */
public interface BentoSpannedText4 {
    /* renamed from: SpannedText-gPmlwdY */
    void mo13684SpannedTextgPmlwdY(Spanned spanned, Modifier modifier, Color color, Color color2, int i, Integer num, int i2, int i3, Function0<Unit> function0, Composer composer, int i4);
}
