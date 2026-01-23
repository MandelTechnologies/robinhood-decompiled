package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.PlatformParagraphStyle;
import androidx.compose.p011ui.text.style.LineBreak;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Savers.android.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r\"$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"LineBreakSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineBreak;", "", "PlatformParagraphStyleSaver", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "TextMotionSaver", "Landroidx/compose/ui/text/style/TextMotion;", "Saver", "Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "getSaver", "(Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineBreak$Companion;", "(Landroidx/compose/ui/text/style/LineBreak$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextMotion$Companion;", "(Landroidx/compose/ui/text/style/TextMotion$Companion;)Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class Savers_androidKt {
    private static final Saver<PlatformParagraphStyle, Object> PlatformParagraphStyleSaver = Saver2.Saver(new Function2<Saver5, PlatformParagraphStyle, Object>() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Saver5 saver5, PlatformParagraphStyle platformParagraphStyle) {
            return CollectionsKt.arrayListOf(SaversKt.save(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding())), SaversKt.save(EmojiSupportMatch.m7533boximpl(platformParagraphStyle.getEmojiSupportMatch())));
        }
    }, new Function1<Object, PlatformParagraphStyle>() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final PlatformParagraphStyle invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Boolean bool = obj2 != null ? (Boolean) obj2 : null;
            Intrinsics.checkNotNull(bool);
            boolean zBooleanValue = bool.booleanValue();
            Object obj3 = list.get(1);
            EmojiSupportMatch emojiSupportMatch = obj3 != null ? (EmojiSupportMatch) obj3 : null;
            Intrinsics.checkNotNull(emojiSupportMatch);
            return new PlatformParagraphStyle(emojiSupportMatch.getValue(), zBooleanValue, null);
        }
    });
    private static final Saver<LineBreak, Object> LineBreakSaver = Saver2.Saver(new Function2<Saver5, LineBreak, Object>() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Saver5 saver5, LineBreak lineBreak) {
            return m7593invokenI23V4A(saver5, lineBreak.getMask());
        }

        /* renamed from: invoke-nI23V4A, reason: not valid java name */
        public final Object m7593invokenI23V4A(Saver5 saver5, int i) {
            return Integer.valueOf(i);
        }
    }, new Function1<Object, LineBreak>() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: invoke-8aCASmQ, reason: not valid java name and merged with bridge method [inline-methods] */
        public final LineBreak invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return LineBreak.m7848boximpl(LineBreak.m7849constructorimpl(((Integer) obj).intValue()));
        }
    });
    private static final Saver<TextMotion, Object> TextMotionSaver = Saver2.Saver(new Function2<Saver5, TextMotion, Object>() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Saver5 saver5, TextMotion textMotion) {
            return CollectionsKt.arrayListOf(SaversKt.save(TextMotion.Linearity.m7944boximpl(textMotion.getLinearity())), SaversKt.save(Boolean.valueOf(textMotion.getSubpixelTextPositioning())));
        }
    }, new Function1<Object, TextMotion>() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final TextMotion invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextMotion.Linearity linearity = obj2 != null ? (TextMotion.Linearity) obj2 : null;
            Intrinsics.checkNotNull(linearity);
            int value = linearity.getValue();
            Object obj3 = list.get(1);
            Boolean bool = obj3 != null ? (Boolean) obj3 : null;
            Intrinsics.checkNotNull(bool);
            return new TextMotion(value, bool.booleanValue(), null);
        }
    });

    public static final Saver<PlatformParagraphStyle, Object> getSaver(PlatformParagraphStyle.Companion companion) {
        return PlatformParagraphStyleSaver;
    }

    public static final Saver<LineBreak, Object> getSaver(LineBreak.Companion companion) {
        return LineBreakSaver;
    }

    public static final Saver<TextMotion, Object> getSaver(TextMotion.Companion companion) {
        return TextMotionSaver;
    }
}
