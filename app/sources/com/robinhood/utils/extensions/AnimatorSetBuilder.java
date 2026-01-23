package com.robinhood.utils.extensions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnimatorSetBuilder.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/extensions/AnimatorSetBuilder;", "", "<init>", "()V", "animatorSet", "Landroid/animation/AnimatorSet;", "builder", "Landroid/animation/AnimatorSet$Builder;", "with", "", "animator", "Landroid/animation/Animator;", "build", "Companion", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AnimatorSetBuilder {
    private final AnimatorSet animatorSet = new AnimatorSet();
    private AnimatorSet.Builder builder;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final void with(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        AnimatorSet.Builder builder = this.builder;
        if (builder == null) {
            this.builder = this.animatorSet.play(animator);
        } else {
            builder.with(animator);
        }
    }

    /* renamed from: build, reason: from getter */
    public final AnimatorSet getAnimatorSet() {
        return this.animatorSet;
    }

    /* compiled from: AnimatorSetBuilder.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000J%\u0010\u000b\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/extensions/AnimatorSetBuilder$Companion;", "", "<init>", "()V", "build", "Landroid/animation/AnimatorSet;", "block", "Lkotlin/Function1;", "Lcom/robinhood/utils/extensions/AnimatorSetBuilder;", "", "Lkotlin/ExtensionFunctionType;", "start", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AnimatorSet build(Function1<? super AnimatorSetBuilder, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            AnimatorSetBuilder animatorSetBuilder = new AnimatorSetBuilder();
            block.invoke(animatorSetBuilder);
            return animatorSetBuilder.getAnimatorSet();
        }

        public final AnimatorSet start(Function1<? super AnimatorSetBuilder, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            AnimatorSetBuilder animatorSetBuilder = new AnimatorSetBuilder();
            block.invoke(animatorSetBuilder);
            AnimatorSet animatorSet = animatorSetBuilder.getAnimatorSet();
            animatorSet.start();
            return animatorSet;
        }
    }
}
