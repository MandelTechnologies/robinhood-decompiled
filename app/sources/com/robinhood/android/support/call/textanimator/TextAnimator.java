package com.robinhood.android.support.call.textanimator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.support.call.textanimator.AnimationType;
import com.robinhood.android.support.call.textanimator.spans.DeleteWordSpan;
import com.robinhood.android.support.call.textanimator.spans.FullReplaceDeleteWordSpan;
import com.robinhood.android.support.call.textanimator.spans.FullReplaceInsertWordSpan;
import com.robinhood.android.support.call.textanimator.spans.InsertWordSpan;
import com.robinhood.android.support.call.textanimator.spans.MoveWordSpan;
import com.robinhood.android.support.call.textanimator.spans.PlainWordSpan;
import com.robinhood.android.support.call.textanimator.spans.RecordWordPositionSpan;
import com.robinhood.android.util.extensions.ViewTags;
import com.robinhood.shared.support.C39996R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference2Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.text.CharsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;

/* compiled from: TextAnimator.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u0000 M2\u00020\u0001:\u0001MB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ \u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0002J \u0010\"\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J \u0010&\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(H\u0002J \u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0002J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\f\u0010/\u001a\u00020\u0019*\u000200H\u0002J\u0019\u00101\u001a\u00020\u0019\"\n\b\u0000\u00102\u0018\u0001*\u00020\u0001*\u000200H\u0082\bJ$\u00103\u001a\u00020\u0019*\u0002042\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.¢\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R3\u0010:\u001a\u0004\u0018\u000109*\u00020\u00032\b\u00108\u001a\u0004\u0018\u0001098B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R3\u0010A\u001a\u0004\u0018\u00010\u001e*\u00020\u00032\b\u00108\u001a\u0004\u0018\u00010\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER3\u0010G\u001a\u0004\u0018\u00010\u001b*\u00020\u00032\b\u00108\u001a\u0004\u0018\u00010\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010@\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/TextAnimator;", "", "textView", "Landroid/widget/TextView;", "<init>", "(Landroid/widget/TextView;)V", "startWidth", "", "startColor", "wordDiffs", "", "Lcom/robinhood/android/support/call/textanimator/WordDiff;", "wordDiffsWithoutDeletes", "getWordDiffsWithoutDeletes", "()Ljava/util/List;", "wordDiffsWithoutDeletes$delegate", "Lkotlin/Lazy;", "wordDiffsWithoutInserts", "getWordDiffsWithoutInserts", "wordDiffsWithoutInserts$delegate", "animationType", "Lcom/robinhood/android/support/call/textanimator/AnimationType;", "animatedFraction", "", "animateText", "", "config", "Lcom/robinhood/android/support/call/textanimator/AnimationConfig;", "recordPositionThenSetTextAndStartAnimation", "startText", "", "endText", "removeExtraSpaces", "text", "setTextAndStartAnimation", "createAnimator", "Landroid/animation/ValueAnimator;", "setTextForPartialReplaceAnimation", "setTextForFullReplaceAnimation", "staggered", "", "getFractionForFullReplaceAnimation", "fraction", "indexFraction", "findAnchorWordDiff", "wordDiff", "buildSpannedEndText", "removeAllSpaces", "Landroid/text/SpannableStringBuilder;", "removeSpans", "T", "setSpan", "Landroid/text/Spannable;", "what", "start", "count", "<set-?>", "Landroid/animation/Animator;", "currentAnimator", "getCurrentAnimator", "(Landroid/widget/TextView;)Landroid/animation/Animator;", "setCurrentAnimator", "(Landroid/widget/TextView;Landroid/animation/Animator;)V", "currentAnimator$delegate", "Lkotlin/properties/ReadWriteProperty;", "unmodifiedText", "getUnmodifiedText", "(Landroid/widget/TextView;)Ljava/lang/CharSequence;", "setUnmodifiedText", "(Landroid/widget/TextView;Ljava/lang/CharSequence;)V", "unmodifiedText$delegate", "nextAnimation", "getNextAnimation", "(Landroid/widget/TextView;)Lcom/robinhood/android/support/call/textanimator/AnimationConfig;", "setNextAnimation", "(Landroid/widget/TextView;Lcom/robinhood/android/support/call/textanimator/AnimationConfig;)V", "nextAnimation$delegate", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
final class TextAnimator {
    private float animatedFraction;
    private AnimationType animationType;

    /* renamed from: currentAnimator$delegate, reason: from kotlin metadata */
    private final Interfaces3 currentAnimator;

    /* renamed from: nextAnimation$delegate, reason: from kotlin metadata */
    private final Interfaces3 nextAnimation;
    private final int startColor;
    private int startWidth;
    private final TextView textView;

    /* renamed from: unmodifiedText$delegate, reason: from kotlin metadata */
    private final Interfaces3 unmodifiedText;
    private List<WordDiff> wordDiffs;

    /* renamed from: wordDiffsWithoutDeletes$delegate, reason: from kotlin metadata */
    private final Lazy wordDiffsWithoutDeletes;

    /* renamed from: wordDiffsWithoutInserts$delegate, reason: from kotlin metadata */
    private final Lazy wordDiffsWithoutInserts;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty2(new MutablePropertyReference2Impl(TextAnimator.class, "currentAnimator", "getCurrentAnimator(Landroid/widget/TextView;)Landroid/animation/Animator;", 0)), Reflection.mutableProperty2(new MutablePropertyReference2Impl(TextAnimator.class, "unmodifiedText", "getUnmodifiedText(Landroid/widget/TextView;)Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty2(new MutablePropertyReference2Impl(TextAnimator.class, "nextAnimation", "getNextAnimation(Landroid/widget/TextView;)Lcom/robinhood/android/support/call/textanimator/AnimationConfig;", 0))};
    private static final DecelerateInterpolator FULL_REPLACE_ANIM_DURATION_INTERPOLATOR = new DecelerateInterpolator(0.25f);
    private static final PathInterpolator DRIFTER_INTERPOLATOR = new PathInterpolator(0.33f, 0.0f, 0.0f, 1.0f);

    private final /* synthetic */ <T> void removeSpans(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length();
        Intrinsics.reifiedOperationMarker(4, "T");
        for (Object obj : spannableStringBuilder.getSpans(0, length, Object.class)) {
            spannableStringBuilder.removeSpan(obj);
        }
    }

    public TextAnimator(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.textView = textView;
        this.startColor = textView.getContext().getColor(C20690R.color.mobius_prime_day);
        this.wordDiffsWithoutDeletes = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextAnimator.wordDiffsWithoutDeletes_delegate$lambda$1(this.f$0);
            }
        });
        this.wordDiffsWithoutInserts = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextAnimator.wordDiffsWithoutInserts_delegate$lambda$3(this.f$0);
            }
        });
        ViewTags viewTags = ViewTags.INSTANCE;
        this.currentAnimator = viewTags.property(C39996R.id.current_animator);
        this.unmodifiedText = viewTags.property(C39996R.id.current_text);
        this.nextAnimation = viewTags.property(C39996R.id.next_animation);
    }

    private final List<WordDiff> getWordDiffsWithoutDeletes() {
        return (List) this.wordDiffsWithoutDeletes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List wordDiffsWithoutDeletes_delegate$lambda$1(TextAnimator textAnimator) {
        List<WordDiff> list = textAnimator.wordDiffs;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wordDiffs");
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((WordDiff) obj).getOperation() != DiffMatchPatch.Operation.DELETE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<WordDiff> getWordDiffsWithoutInserts() {
        return (List) this.wordDiffsWithoutInserts.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List wordDiffsWithoutInserts_delegate$lambda$3(TextAnimator textAnimator) {
        List<WordDiff> list = textAnimator.wordDiffs;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wordDiffs");
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((WordDiff) obj).getOperation() != DiffMatchPatch.Operation.INSERT) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void animateText(AnimationConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Animator currentAnimator = getCurrentAnimator(this.textView);
        if (currentAnimator != null && currentAnimator.isRunning()) {
            setNextAnimation(this.textView, config);
            return;
        }
        CharSequence text = config.getText();
        String string2 = text.toString();
        if (Intrinsics.areEqual(String.valueOf(getUnmodifiedText(this.textView)), string2) || Intrinsics.areEqual(this.textView.getText().toString(), string2)) {
            return;
        }
        setUnmodifiedText(this.textView, text);
        this.animationType = config.getAnimationType();
        CharSequence text2 = this.textView.getText();
        CharSequence charSequenceRemoveExtraSpaces = removeExtraSpaces(text);
        this.wordDiffs = TextAnimatorKt.getDiff(text2.toString(), charSequenceRemoveExtraSpaces.toString());
        Intrinsics.checkNotNull(text2);
        if (StringsKt.isBlank(text2)) {
            setTextAndStartAnimation(text2, charSequenceRemoveExtraSpaces, config);
        } else {
            recordPositionThenSetTextAndStartAnimation(text2, charSequenceRemoveExtraSpaces, config);
        }
    }

    private final void recordPositionThenSetTextAndStartAnimation(CharSequence startText, CharSequence endText, final AnimationConfig config) {
        TextView textView = this.textView;
        SpannableString spannableStringValueOf = SpannableString.valueOf(startText);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        int length = 0;
        for (final WordDiff wordDiff : getWordDiffsWithoutInserts()) {
            final CharSequence charSequence = startText;
            final CharSequence charSequence2 = endText;
            setSpan(spannableStringValueOf, new RecordWordPositionSpan(new Function4() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return TextAnimator.recordPositionThenSetTextAndStartAnimation$lambda$5$lambda$4(booleanRef, wordDiff, this, charSequence, charSequence2, config, ((Integer) obj).intValue(), (String) obj2, ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
                }
            }), length, wordDiff.getText().length());
            length += wordDiff.getText().length() + 1;
            startText = charSequence;
            endText = charSequence2;
        }
        textView.setText(spannableStringValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordPositionThenSetTextAndStartAnimation$lambda$5$lambda$4(Ref.BooleanRef booleanRef, WordDiff wordDiff, final TextAnimator textAnimator, final CharSequence charSequence, final CharSequence charSequence2, final AnimationConfig animationConfig, int i, String text, int i2, int i3) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (StringsKt.startsWith$default(text, "…\ufeff", false, 2, (Object) null)) {
            booleanRef.element = true;
        }
        if (!booleanRef.element) {
            wordDiff.getStartPositions().put(Integer.valueOf(i), new Point(i2, i3));
        }
        textAnimator.textView.post(new Runnable() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$recordPositionThenSetTextAndStartAnimation$1$setPosition$1$1
            @Override // java.lang.Runnable
            public final void run() {
                TextAnimator textAnimator2 = this.this$0;
                if (textAnimator2.getCurrentAnimator(textAnimator2.textView) == null) {
                    this.this$0.setTextAndStartAnimation(charSequence, charSequence2, animationConfig);
                }
            }
        });
        return Unit.INSTANCE;
    }

    private final CharSequence removeExtraSpaces(CharSequence text) {
        CharSequence charSequenceTrim = StringsKt.trim(text);
        Sequence<MatchResult> sequenceFindAll$default = Regex.findAll$default(new Regex("  +"), charSequenceTrim, 0, 2, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceTrim);
        for (MatchResult matchResult : sequenceFindAll$default) {
            spannableStringBuilder.replace(matchResult.getRange().getFirst(), matchResult.getRange().getLast(), (CharSequence) "");
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextAndStartAnimation(CharSequence startText, CharSequence endText, AnimationConfig config) {
        config.getOnAnimationStart().invoke();
        TextView textView = this.textView;
        textView.setMinHeight(textView.getHeight());
        TextView textView2 = this.textView;
        textView2.setMinWidth(textView2.getWidth());
        this.startWidth = this.textView.getWidth();
        AnimationType animationType = this.animationType;
        if (animationType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animationType");
            animationType = null;
        }
        if (animationType instanceof AnimationType.FullReplace) {
            setTextForFullReplaceAnimation(startText, endText, ((AnimationType.FullReplace) animationType).getStaggered());
        } else {
            if (!(animationType instanceof AnimationType.PartialReplace)) {
                throw new NoWhenBranchMatchedException();
            }
            setTextForPartialReplaceAnimation(startText, endText);
        }
        ValueAnimator valueAnimatorCreateAnimator = createAnimator(endText, config);
        setCurrentAnimator(this.textView, valueAnimatorCreateAnimator);
        valueAnimatorCreateAnimator.start();
    }

    private final ValueAnimator createAnimator(final CharSequence endText, final AnimationConfig config) {
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(config.getAnimationType().getDurationMs());
        valueAnimatorOfFloat.setInterpolator(DRIFTER_INTERPOLATOR);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$createAnimator$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.animatedFraction = valueAnimatorOfFloat.getAnimatedFraction();
                this.this$0.textView.invalidate();
            }
        });
        final Function1 function1 = new Function1() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextAnimator.createAnimator$lambda$9$lambda$8(this.f$0, config, endText, (Animator) obj);
            }
        };
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$createAnimator$lambda$9$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                function1.invoke(animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                function1.invoke(animator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createAnimator$lambda$9$lambda$8(TextAnimator textAnimator, AnimationConfig animationConfig, CharSequence charSequence, Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TextView textView = textAnimator.textView;
        animationConfig.getOnAnimationEnd().invoke();
        textView.setText(textAnimator.buildSpannedEndText(charSequence));
        textView.setMinHeight(0);
        textView.setMinWidth(0);
        textAnimator.setCurrentAnimator(textView, null);
        AnimationConfig nextAnimation = textAnimator.getNextAnimation(textView);
        if (nextAnimation != null) {
            textAnimator.setNextAnimation(textView, null);
            TextAnimatorKt.setAnimatedText(textView, nextAnimation);
        }
        return Unit.INSTANCE;
    }

    private final void setTextForPartialReplaceAnimation(CharSequence startText, CharSequence endText) {
        TextView textView = this.textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(startText);
        removeAllSpaces(spannableStringBuilder);
        spannableStringBuilder.append(endText);
        int i = 0;
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), PlainWordSpan.class)) {
            spannableStringBuilder.removeSpan(obj);
        }
        for (WordDiff wordDiff : getWordDiffsWithoutInserts()) {
            int length = wordDiff.getText().length();
            if (wordDiff.getOperation() == DiffMatchPatch.Operation.EQUAL || !wordDiff.getHasStartPosition()) {
                spannableStringBuilder.replace(i, length + i, "");
            } else {
                setSpan(spannableStringBuilder, new DeleteWordSpan(this.startWidth, wordDiff, this.textView.getGravity(), new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$setTextForPartialReplaceAnimation$1$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                    public Object get() {
                        return Float.valueOf(((TextAnimator) this.receiver).animatedFraction);
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                    public void set(Object obj2) {
                        ((TextAnimator) this.receiver).animatedFraction = ((Number) obj2).floatValue();
                    }
                }), i, length);
                i += length;
            }
        }
        if (!Intrinsics.areEqual(spannableStringBuilder.subSequence(i, spannableStringBuilder.length()).toString(), endText.toString())) {
            throw new IllegalStateException("Check failed.");
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (final WordDiff wordDiff2 : getWordDiffsWithoutDeletes()) {
            Function2 function2 = new Function2() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return TextAnimator.setTextForPartialReplaceAnimation$lambda$11$lambda$10(booleanRef, this, wordDiff2, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                }
            };
            int length2 = wordDiff2.getText().length();
            if (wordDiff2.getOperation() == DiffMatchPatch.Operation.INSERT) {
                setSpan(spannableStringBuilder, new InsertWordSpan(this.startColor, wordDiff2, new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$setTextForPartialReplaceAnimation$1$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                    public Object get() {
                        return Float.valueOf(((TextAnimator) this.receiver).animatedFraction);
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                    public void set(Object obj2) {
                        ((TextAnimator) this.receiver).animatedFraction = ((Number) obj2).floatValue();
                    }
                }, function2), i, length2);
            } else if (wordDiff2.getOperation() == DiffMatchPatch.Operation.EQUAL) {
                setSpan(spannableStringBuilder, new MoveWordSpan(this.startWidth, this.startColor, wordDiff2, this.textView.getGravity(), new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$setTextForPartialReplaceAnimation$1$3
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                    public Object get() {
                        return Float.valueOf(((TextAnimator) this.receiver).animatedFraction);
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                    public void set(Object obj2) {
                        ((TextAnimator) this.receiver).animatedFraction = ((Number) obj2).floatValue();
                    }
                }, function2), i, length2);
            }
            i += length2 + 1;
        }
        textView.setText(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTextForPartialReplaceAnimation$lambda$11$lambda$10(Ref.BooleanRef booleanRef, final TextAnimator textAnimator, WordDiff wordDiff, int i, int i2) {
        if (!booleanRef.element) {
            booleanRef.element = true;
            textAnimator.textView.post(new Runnable() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$setTextForPartialReplaceAnimation$1$setEndPosition$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    List<WordDiff> list = this.this$0.wordDiffs;
                    if (list == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("wordDiffs");
                        list = null;
                    }
                    for (WordDiff wordDiff2 : list) {
                        wordDiff2.setAnchor(this.this$0.findAnchorWordDiff(wordDiff2));
                    }
                }
            });
        }
        wordDiff.setEndPosition(i, i2);
        return Unit.INSTANCE;
    }

    private final void setTextForFullReplaceAnimation(CharSequence startText, CharSequence endText, final boolean staggered) {
        TextView textView = this.textView;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(startText);
        removeAllSpaces(spannableStringBuilder);
        spannableStringBuilder.append(endText);
        int i = 0;
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), PlainWordSpan.class)) {
            spannableStringBuilder.removeSpan(obj);
        }
        int length = 0;
        int i2 = 0;
        for (WordDiff wordDiff : getWordDiffsWithoutInserts()) {
            int i3 = i2 + 1;
            int length2 = wordDiff.getText().length();
            if (!wordDiff.getHasStartPosition()) {
                spannableStringBuilder.replace(length, length2 + length, "");
            } else {
                final float size = i2 / getWordDiffsWithoutInserts().size();
                setSpan(spannableStringBuilder, new FullReplaceDeleteWordSpan(CollectionsKt.toList(wordDiff.getStartPositions().values()), this.startWidth, this.textView.getGravity(), new Function0() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(TextAnimator.setTextForFullReplaceAnimation$lambda$14$lambda$12(this.f$0, size, staggered));
                    }
                }), length, length2);
                length += length2;
            }
            i2 = i3;
        }
        if (!Intrinsics.areEqual(spannableStringBuilder.subSequence(length, spannableStringBuilder.length()).toString(), endText.toString())) {
            throw new IllegalStateException("Check failed.");
        }
        for (WordDiff wordDiff2 : getWordDiffsWithoutDeletes()) {
            int i4 = i + 1;
            final float size2 = i / getWordDiffsWithoutDeletes().size();
            setSpan(spannableStringBuilder, new FullReplaceInsertWordSpan(this.startColor, new Function0() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(TextAnimator.setTextForFullReplaceAnimation$lambda$14$lambda$13(this.f$0, size2, staggered));
                }
            }), length, wordDiff2.getText().length());
            length += wordDiff2.getText().length() + 1;
            i = i4;
        }
        textView.setText(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float setTextForFullReplaceAnimation$lambda$14$lambda$12(TextAnimator textAnimator, float f, boolean z) {
        return textAnimator.getFractionForFullReplaceAnimation(textAnimator.animatedFraction, f, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float setTextForFullReplaceAnimation$lambda$14$lambda$13(TextAnimator textAnimator, float f, boolean z) {
        return textAnimator.getFractionForFullReplaceAnimation(textAnimator.animatedFraction, f, z);
    }

    private final float getFractionForFullReplaceAnimation(float fraction, float indexFraction, boolean staggered) {
        if (staggered) {
            float interpolation = FULL_REPLACE_ANIM_DURATION_INTERPOLATOR.getInterpolation(indexFraction);
            return DRIFTER_INTERPOLATOR.getInterpolation(TimingInterpolator.INSTANCE.getInterpolation(fraction, interpolation, 1 - interpolation));
        }
        return DRIFTER_INTERPOLATOR.getInterpolation(fraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WordDiff findAnchorWordDiff(WordDiff wordDiff) {
        WordDiff wordDiffPrevious;
        List<WordDiff> list = this.wordDiffs;
        Object obj = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wordDiffs");
            list = null;
        }
        int iIndexOf = list.indexOf(wordDiff);
        Function1 function1 = new Function1() { // from class: com.robinhood.android.support.call.textanimator.TextAnimator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(TextAnimator.findAnchorWordDiff$lambda$15((WordDiff) obj2));
            }
        };
        List<WordDiff> list2 = this.wordDiffs;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wordDiffs");
            list2 = null;
        }
        List<WordDiff> listSubList = list2.subList(0, iIndexOf);
        ListIterator<WordDiff> listIterator = listSubList.listIterator(listSubList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                wordDiffPrevious = null;
                break;
            }
            wordDiffPrevious = listIterator.previous();
            if (((Boolean) function1.invoke(wordDiffPrevious)).booleanValue()) {
                break;
            }
        }
        WordDiff wordDiff2 = wordDiffPrevious;
        List<WordDiff> list3 = this.wordDiffs;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wordDiffs");
            list3 = null;
        }
        int i = iIndexOf + 1;
        List<WordDiff> list4 = this.wordDiffs;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wordDiffs");
            list4 = null;
        }
        Iterator<T> it = list3.subList(i, list4.size()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Boolean) function1.invoke(next)).booleanValue()) {
                obj = next;
                break;
            }
        }
        WordDiff wordDiff3 = (WordDiff) obj;
        return Math.abs(wordDiff2 != null ? wordDiff2.getDeltaX() : 0) > Math.abs(wordDiff3 != null ? wordDiff3.getDeltaX() : 0) ? wordDiff2 : wordDiff3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findAnchorWordDiff$lambda$15(WordDiff it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getHasStartPosition() && it.getHasEndPosition() && Intrinsics.areEqual(it.getStartPositionY(), it.getEndPositionY());
    }

    private final CharSequence buildSpannedEndText(CharSequence endText) {
        List<String> listSplit$default = StringsKt.split$default(endText, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null);
        SpannableString spannableStringValueOf = SpannableString.valueOf(endText);
        int length = 0;
        for (String str : listSplit$default) {
            setSpan(spannableStringValueOf, new PlainWordSpan(), length, str.length());
            length += str.length() + 1;
        }
        return spannableStringValueOf;
    }

    private final void removeAllSpaces(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length();
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            }
            if (CharsKt.isWhitespace(spannableStringBuilder.charAt(length))) {
                spannableStringBuilder.replace(length, length + 1, "");
            }
        }
    }

    private final void setSpan(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2 + i, 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Animator getCurrentAnimator(TextView textView) {
        return (Animator) this.currentAnimator.getValue(textView, $$delegatedProperties[0]);
    }

    private final void setCurrentAnimator(TextView textView, Animator animator) {
        this.currentAnimator.setValue(textView, $$delegatedProperties[0], animator);
    }

    private final CharSequence getUnmodifiedText(TextView textView) {
        return (CharSequence) this.unmodifiedText.getValue(textView, $$delegatedProperties[1]);
    }

    private final void setUnmodifiedText(TextView textView, CharSequence charSequence) {
        this.unmodifiedText.setValue(textView, $$delegatedProperties[1], charSequence);
    }

    private final AnimationConfig getNextAnimation(TextView textView) {
        return (AnimationConfig) this.nextAnimation.getValue(textView, $$delegatedProperties[2]);
    }

    private final void setNextAnimation(TextView textView, AnimationConfig animationConfig) {
        this.nextAnimation.setValue(textView, $$delegatedProperties[2], animationConfig);
    }
}
