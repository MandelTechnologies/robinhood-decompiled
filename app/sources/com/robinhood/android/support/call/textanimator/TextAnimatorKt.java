package com.robinhood.android.support.call.textanimator;

import android.widget.TextView;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.support.call.textanimator.AnimationType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatches;

/* compiled from: TextAnimator.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¨\u0006\u0012"}, m3636d2 = {"setAnimatedText", "", "Landroid/widget/TextView;", "text", "", "animationType", "Lcom/robinhood/android/support/call/textanimator/AnimationType;", "onAnimationStart", "Lkotlin/Function0;", "onAnimationEnd", "animationConfig", "Lcom/robinhood/android/support/call/textanimator/AnimationConfig;", "getDiff", "", "Lcom/robinhood/android/support/call/textanimator/WordDiff;", "text1", "", "text2", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TextAnimatorKt {
    public static /* synthetic */ void setAnimatedText$default(TextView textView, CharSequence charSequence, AnimationType animationType, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            animationType = new AnimationType.FullReplace(0L, true, 1, null);
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.support.call.textanimator.TextAnimatorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            function02 = new Function0() { // from class: com.robinhood.android.support.call.textanimator.TextAnimatorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        setAnimatedText(textView, charSequence, animationType, function0, function02);
    }

    public static final void setAnimatedText(TextView textView, CharSequence text, AnimationType animationType, Function0<Unit> onAnimationStart, Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        Intrinsics.checkNotNullParameter(onAnimationStart, "onAnimationStart");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        setAnimatedText(textView, new AnimationConfig(text, animationType, onAnimationStart, onAnimationEnd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAnimatedText(TextView textView, AnimationConfig animationConfig) {
        new TextAnimator(textView).animateText(animationConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<WordDiff> getDiff(String str, String str2) {
        return SequencesKt.toList(SequencesKt.map(SequencesKt.flatMap(CollectionsKt.asSequence(DiffMatchPatches.diffWordMode(new DiffMatchPatch(), str, str2)), new Function1() { // from class: com.robinhood.android.support.call.textanimator.TextAnimatorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextAnimatorKt.getDiff$lambda$4((DiffMatchPatch.Diff) obj);
            }
        }), C289702.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence getDiff$lambda$4(final DiffMatchPatch.Diff diff) {
        Intrinsics.checkNotNullParameter(diff, "diff");
        String text = diff.text;
        Intrinsics.checkNotNullExpressionValue(text, "text");
        return SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(StringsKt.split$default((CharSequence) text, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null)), new Function1() { // from class: com.robinhood.android.support.call.textanimator.TextAnimatorKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TextAnimatorKt.getDiff$lambda$4$lambda$2((String) obj));
            }
        }), new Function1() { // from class: com.robinhood.android.support.call.textanimator.TextAnimatorKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextAnimatorKt.getDiff$lambda$4$lambda$3(diff, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getDiff$lambda$4$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !StringsKt.isBlank(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiffMatchPatch.Diff getDiff$lambda$4$lambda$3(DiffMatchPatch.Diff diff, String word) {
        Intrinsics.checkNotNullParameter(word, "word");
        return new DiffMatchPatch.Diff(diff.f10819operation, word);
    }

    /* compiled from: TextAnimator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.support.call.textanimator.TextAnimatorKt$getDiff$2 */
    /* synthetic */ class C289702 extends FunctionReferenceImpl implements Function1<DiffMatchPatch.Diff, WordDiff> {
        public static final C289702 INSTANCE = new C289702();

        C289702() {
            super(1, WordDiff.class, "<init>", "<init>(Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch$Diff;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WordDiff invoke(DiffMatchPatch.Diff p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return new WordDiff(p0);
        }
    }
}
