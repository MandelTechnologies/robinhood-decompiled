package com.robinhood.android.designsystem.text;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ThemableColorSpans.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rR\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\b\u001a\u00020\u0005H$R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/text/ThemableColorSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "reference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;)V", ResourceTypes.COLOR, "Ljava/lang/Integer;", "update", "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "updateDrawState", "paint", "Landroid/text/TextPaint;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.designsystem.text.ThemableColorSpan, reason: use source file name */
/* loaded from: classes17.dex */
public abstract class ThemableColorSpans2 extends CharacterStyle implements UpdateAppearance {
    private Integer color;
    private final ResourceReferences4<Integer> reference;

    protected abstract void updateDrawState(TextPaint paint, int color);

    public ThemableColorSpans2(ResourceReferences4<Integer> reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.reference = reference;
    }

    public final void update(Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.color = this.reference.resolveOrThrow(theme);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Integer num = this.color;
        if (num == null) {
            throw new IllegalArgumentException(("Never initialized with a theme in which to resolve " + this.reference).toString());
        }
        updateDrawState(paint, num.intValue());
    }
}
