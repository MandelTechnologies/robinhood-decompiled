package com.robinhood.android.psp;

import android.content.res.Resources;
import android.graphics.Color;
import com.google.android.material.math.MathUtils;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.bonfire.ApiPspEnrollmentResponse;
import com.robinhood.models.p320db.bonfire.ProgramDetail;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.time.android.format.DurationFormatter2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.Durations;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: ProgramDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0003XYZBa\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010A\u001a\u0004\u0018\u00010\u0005J\u0010\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020EJ\u0010\u0010J\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010KJ\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0007HÆ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\t\u0010P\u001a\u00020\u000eHÆ\u0003J\t\u0010Q\u001a\u00020\u000eHÆ\u0003Jh\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u000e2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020$HÖ\u0001J\t\u0010W\u001a\u00020CHÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001bR\u0011\u0010)\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001bR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b3\u00101R\u0013\u00104\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b5\u0010\u0014R\u0013\u00106\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b7\u0010\u0014R\u0013\u00108\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b9\u0010\u0014R\u0011\u0010:\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0011\u0010?\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b@\u0010<R\u0016\u0010F\u001a\u0004\u0018\u00010G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006["}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState;", "", "holdDownProgress", "", "animationSegment", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment;", "result", "Lcom/robinhood/android/psp/ProgramDetailViewState$Result;", "onFirstLoadEvent", "Lcom/robinhood/udf/UiEvent;", "", "enrollmentEvent", "Lcom/robinhood/android/psp/ProgramDetailViewState$EnrollmentResult;", "animationLoaded", "", "buttonFadeInShown", "<init>", "(Ljava/lang/Float;Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment;Lcom/robinhood/android/psp/ProgramDetailViewState$Result;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZ)V", "Ljava/lang/Float;", "getAnimationSegment", "()Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment;", "getResult", "()Lcom/robinhood/android/psp/ProgramDetailViewState$Result;", "getOnFirstLoadEvent", "()Lcom/robinhood/udf/UiEvent;", "getEnrollmentEvent", "getAnimationLoaded", "()Z", "getButtonFadeInShown", "showLoading", "getShowLoading", "animation", "Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;", "getAnimation", "()Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;", "overrideFrame", "", "getOverrideFrame", "()Ljava/lang/Integer;", "programDetailVisible", "getProgramDetailVisible", "isFooterVisible", "footerButtons", "", "Lcom/robinhood/android/psp/ButtonWithColor;", "getFooterButtons", "()Ljava/util/List;", "translationProgress", "getTranslationProgress", "()F", "introTextAlpha", "getIntroTextAlpha", "userInteractionSegment", "getUserInteractionSegment", "entryLoopSegment", "getEntryLoopSegment", "cubesExitSegment", "getCubesExitSegment", "cubesLeftFrame", "getCubesLeftFrame", "()I", "cubesCenterFrame", "getCubesCenterFrame", "cubesRightFrame", "getCubesRightFrame", "nextAnimationSegment", "footerText", "", "res", "Landroid/content/res/Resources;", "viewModel", "Lcom/robinhood/models/db/bonfire/ProgramDetail$ProgramDetailViewModel;", "getViewModel", "()Lcom/robinhood/models/db/bonfire/ProgramDetail$ProgramDetailViewModel;", "component1", "()Ljava/lang/Float;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Float;Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment;Lcom/robinhood/android/psp/ProgramDetailViewState$Result;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZ)Lcom/robinhood/android/psp/ProgramDetailViewState;", "equals", "other", "hashCode", "toString", "EnrollmentResult", "Result", "AnimationSegment", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class ProgramDetailViewState {
    public static final int $stable = 8;
    private final boolean animationLoaded;
    private final AnimationSegment animationSegment;
    private final boolean buttonFadeInShown;
    private final UiEvent<EnrollmentResult> enrollmentEvent;
    private final Float holdDownProgress;
    private final UiEvent<Unit> onFirstLoadEvent;
    private final Result result;

    public ProgramDetailViewState() {
        this(null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    /* renamed from: component1, reason: from getter */
    private final Float getHoldDownProgress() {
        return this.holdDownProgress;
    }

    public static /* synthetic */ ProgramDetailViewState copy$default(ProgramDetailViewState programDetailViewState, Float f, AnimationSegment animationSegment, Result result, UiEvent uiEvent, UiEvent uiEvent2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = programDetailViewState.holdDownProgress;
        }
        if ((i & 2) != 0) {
            animationSegment = programDetailViewState.animationSegment;
        }
        if ((i & 4) != 0) {
            result = programDetailViewState.result;
        }
        if ((i & 8) != 0) {
            uiEvent = programDetailViewState.onFirstLoadEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = programDetailViewState.enrollmentEvent;
        }
        if ((i & 32) != 0) {
            z = programDetailViewState.animationLoaded;
        }
        if ((i & 64) != 0) {
            z2 = programDetailViewState.buttonFadeInShown;
        }
        boolean z3 = z;
        boolean z4 = z2;
        UiEvent uiEvent3 = uiEvent2;
        Result result2 = result;
        return programDetailViewState.copy(f, animationSegment, result2, uiEvent, uiEvent3, z3, z4);
    }

    /* renamed from: component2, reason: from getter */
    public final AnimationSegment getAnimationSegment() {
        return this.animationSegment;
    }

    /* renamed from: component3, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    public final UiEvent<Unit> component4() {
        return this.onFirstLoadEvent;
    }

    public final UiEvent<EnrollmentResult> component5() {
        return this.enrollmentEvent;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAnimationLoaded() {
        return this.animationLoaded;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getButtonFadeInShown() {
        return this.buttonFadeInShown;
    }

    public final ProgramDetailViewState copy(Float holdDownProgress, AnimationSegment animationSegment, Result result, UiEvent<Unit> onFirstLoadEvent, UiEvent<EnrollmentResult> enrollmentEvent, boolean animationLoaded, boolean buttonFadeInShown) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new ProgramDetailViewState(holdDownProgress, animationSegment, result, onFirstLoadEvent, enrollmentEvent, animationLoaded, buttonFadeInShown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgramDetailViewState)) {
            return false;
        }
        ProgramDetailViewState programDetailViewState = (ProgramDetailViewState) other;
        return Intrinsics.areEqual((Object) this.holdDownProgress, (Object) programDetailViewState.holdDownProgress) && Intrinsics.areEqual(this.animationSegment, programDetailViewState.animationSegment) && Intrinsics.areEqual(this.result, programDetailViewState.result) && Intrinsics.areEqual(this.onFirstLoadEvent, programDetailViewState.onFirstLoadEvent) && Intrinsics.areEqual(this.enrollmentEvent, programDetailViewState.enrollmentEvent) && this.animationLoaded == programDetailViewState.animationLoaded && this.buttonFadeInShown == programDetailViewState.buttonFadeInShown;
    }

    public int hashCode() {
        Float f = this.holdDownProgress;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        AnimationSegment animationSegment = this.animationSegment;
        int iHashCode2 = (((iHashCode + (animationSegment == null ? 0 : animationSegment.hashCode())) * 31) + this.result.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.onFirstLoadEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<EnrollmentResult> uiEvent2 = this.enrollmentEvent;
        return ((((iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0)) * 31) + Boolean.hashCode(this.animationLoaded)) * 31) + Boolean.hashCode(this.buttonFadeInShown);
    }

    public String toString() {
        return "ProgramDetailViewState(holdDownProgress=" + this.holdDownProgress + ", animationSegment=" + this.animationSegment + ", result=" + this.result + ", onFirstLoadEvent=" + this.onFirstLoadEvent + ", enrollmentEvent=" + this.enrollmentEvent + ", animationLoaded=" + this.animationLoaded + ", buttonFadeInShown=" + this.buttonFadeInShown + ")";
    }

    public ProgramDetailViewState(Float f, AnimationSegment animationSegment, Result result, UiEvent<Unit> uiEvent, UiEvent<EnrollmentResult> uiEvent2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.holdDownProgress = f;
        this.animationSegment = animationSegment;
        this.result = result;
        this.onFirstLoadEvent = uiEvent;
        this.enrollmentEvent = uiEvent2;
        this.animationLoaded = z;
        this.buttonFadeInShown = z2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ProgramDetailViewState(java.lang.Float r2, com.robinhood.android.psp.ProgramDetailViewState.AnimationSegment r3, com.robinhood.android.psp.ProgramDetailViewState.Result r4, com.robinhood.udf.UiEvent r5, com.robinhood.udf.UiEvent r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L9
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L9:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lf
            r3 = r0
        Lf:
            r10 = r9 & 4
            if (r10 == 0) goto L15
            com.robinhood.android.psp.ProgramDetailViewState$Result$Loading r4 = com.robinhood.android.psp.ProgramDetailViewState.Result.Loading.INSTANCE
        L15:
            r10 = r9 & 8
            if (r10 == 0) goto L1a
            r5 = r0
        L1a:
            r10 = r9 & 16
            if (r10 == 0) goto L1f
            r6 = r0
        L1f:
            r10 = r9 & 32
            r0 = 0
            if (r10 == 0) goto L25
            r7 = r0
        L25:
            r9 = r9 & 64
            if (r9 == 0) goto L32
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3a
        L32:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.psp.ProgramDetailViewState.<init>(java.lang.Float, com.robinhood.android.psp.ProgramDetailViewState$AnimationSegment, com.robinhood.android.psp.ProgramDetailViewState$Result, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final AnimationSegment getAnimationSegment() {
        return this.animationSegment;
    }

    public final Result getResult() {
        return this.result;
    }

    public final UiEvent<Unit> getOnFirstLoadEvent() {
        return this.onFirstLoadEvent;
    }

    public final UiEvent<EnrollmentResult> getEnrollmentEvent() {
        return this.enrollmentEvent;
    }

    public final boolean getAnimationLoaded() {
        return this.animationLoaded;
    }

    public final boolean getButtonFadeInShown() {
        return this.buttonFadeInShown;
    }

    public final boolean getShowLoading() {
        Result result = this.result;
        if ((result instanceof Result.Error) || Intrinsics.areEqual(result, Result.Loading.INSTANCE)) {
            return true;
        }
        if (result instanceof Result.Success) {
            return !this.animationLoaded;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: ProgramDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$EnrollmentResult;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/robinhood/android/psp/ProgramDetailViewState$EnrollmentResult$Error;", "Lcom/robinhood/android/psp/ProgramDetailViewState$EnrollmentResult$Loading;", "Lcom/robinhood/android/psp/ProgramDetailViewState$EnrollmentResult$Success;", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class EnrollmentResult {
        public static final int $stable = 0;

        public /* synthetic */ EnrollmentResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$EnrollmentResult$Loading;", "Lcom/robinhood/android/psp/ProgramDetailViewState$EnrollmentResult;", "<init>", "()V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends EnrollmentResult {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private EnrollmentResult() {
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$EnrollmentResult$Success;", "Lcom/robinhood/android/psp/ProgramDetailViewState$EnrollmentResult;", "programId", "Ljava/util/UUID;", "enrollmentResponse", "Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;)V", "getProgramId", "()Ljava/util/UUID;", "getEnrollmentResponse", "()Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends EnrollmentResult {
            public static final int $stable = 8;
            private final ApiPspEnrollmentResponse enrollmentResponse;
            private final UUID programId;

            public static /* synthetic */ Success copy$default(Success success, UUID uuid, ApiPspEnrollmentResponse apiPspEnrollmentResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = success.programId;
                }
                if ((i & 2) != 0) {
                    apiPspEnrollmentResponse = success.enrollmentResponse;
                }
                return success.copy(uuid, apiPspEnrollmentResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getProgramId() {
                return this.programId;
            }

            /* renamed from: component2, reason: from getter */
            public final ApiPspEnrollmentResponse getEnrollmentResponse() {
                return this.enrollmentResponse;
            }

            public final Success copy(UUID programId, ApiPspEnrollmentResponse enrollmentResponse) {
                Intrinsics.checkNotNullParameter(programId, "programId");
                Intrinsics.checkNotNullParameter(enrollmentResponse, "enrollmentResponse");
                return new Success(programId, enrollmentResponse);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.programId, success.programId) && Intrinsics.areEqual(this.enrollmentResponse, success.enrollmentResponse);
            }

            public int hashCode() {
                return (this.programId.hashCode() * 31) + this.enrollmentResponse.hashCode();
            }

            public String toString() {
                return "Success(programId=" + this.programId + ", enrollmentResponse=" + this.enrollmentResponse + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(UUID programId, ApiPspEnrollmentResponse enrollmentResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(programId, "programId");
                Intrinsics.checkNotNullParameter(enrollmentResponse, "enrollmentResponse");
                this.programId = programId;
                this.enrollmentResponse = enrollmentResponse;
            }

            public final ApiPspEnrollmentResponse getEnrollmentResponse() {
                return this.enrollmentResponse;
            }

            public final UUID getProgramId() {
                return this.programId;
            }
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$EnrollmentResult$Error;", "Lcom/robinhood/android/psp/ProgramDetailViewState$EnrollmentResult;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error extends EnrollmentResult {
            public static final int $stable = 8;
            private final Throwable throwable;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Error copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Error(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }

    /* compiled from: ProgramDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$Result;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/robinhood/android/psp/ProgramDetailViewState$Result$Error;", "Lcom/robinhood/android/psp/ProgramDetailViewState$Result$Loading;", "Lcom/robinhood/android/psp/ProgramDetailViewState$Result$Success;", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$Result$Loading;", "Lcom/robinhood/android/psp/ProgramDetailViewState$Result;", "<init>", "()V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends Result {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        private Result() {
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$Result$Success;", "Lcom/robinhood/android/psp/ProgramDetailViewState$Result;", "programDetail", "Lcom/robinhood/models/db/bonfire/ProgramDetail;", "<init>", "(Lcom/robinhood/models/db/bonfire/ProgramDetail;)V", "viewModel", "Lcom/robinhood/models/db/bonfire/ProgramDetail$ProgramDetailViewModel;", "getViewModel", "()Lcom/robinhood/models/db/bonfire/ProgramDetail$ProgramDetailViewModel;", "backgroundColor", "", "getBackgroundColor", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Result {
            public static final int $stable = 8;
            private final int backgroundColor;
            private final ProgramDetail programDetail;
            private final ProgramDetail.ProgramDetailViewModel viewModel;

            /* renamed from: component1, reason: from getter */
            private final ProgramDetail getProgramDetail() {
                return this.programDetail;
            }

            public static /* synthetic */ Success copy$default(Success success, ProgramDetail programDetail, int i, Object obj) {
                if ((i & 1) != 0) {
                    programDetail = success.programDetail;
                }
                return success.copy(programDetail);
            }

            public final Success copy(ProgramDetail programDetail) {
                Intrinsics.checkNotNullParameter(programDetail, "programDetail");
                return new Success(programDetail);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.programDetail, ((Success) other).programDetail);
            }

            public int hashCode() {
                return this.programDetail.hashCode();
            }

            public String toString() {
                return "Success(programDetail=" + this.programDetail + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(ProgramDetail programDetail) {
                super(null);
                Intrinsics.checkNotNullParameter(programDetail, "programDetail");
                this.programDetail = programDetail;
                ProgramDetail.ProgramDetailViewModel viewModel = programDetail.getViewModel();
                this.viewModel = viewModel;
                this.backgroundColor = Color.parseColor(viewModel.getBackgroundColor());
            }

            public final ProgramDetail.ProgramDetailViewModel getViewModel() {
                return this.viewModel;
            }

            public final int getBackgroundColor() {
                return this.backgroundColor;
            }
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$Result$Error;", "Lcom/robinhood/android/psp/ProgramDetailViewState$Result;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error extends Result {
            public static final int $stable = 8;
            private final Throwable throwable;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Error copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Error(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }

    private final ProgramDetail.Animation getAnimation() {
        Result result = this.result;
        if ((result instanceof Result.Error) || Intrinsics.areEqual(result, Result.Loading.INSTANCE)) {
            return null;
        }
        if (result instanceof Result.Success) {
            return ((Result.Success) this.result).getViewModel().getAnimation();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Integer getOverrideFrame() {
        AnimationSegment animationSegment = this.animationSegment;
        if (animationSegment instanceof AnimationSegment.UserInteraction) {
            float start = ((AnimationSegment.UserInteraction) animationSegment).getStart();
            float end = ((AnimationSegment.UserInteraction) this.animationSegment).getEnd();
            Float f = this.holdDownProgress;
            Intrinsics.checkNotNull(f);
            return Integer.valueOf((int) MathUtils.lerp(start, end, f.floatValue()));
        }
        if ((animationSegment instanceof AnimationSegment.Entry) || (animationSegment instanceof AnimationSegment.EntryLoop) || (animationSegment instanceof AnimationSegment.Exit) || (animationSegment instanceof AnimationSegment.ExitLoop) || (animationSegment instanceof AnimationSegment.CubesExit) || animationSegment == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getProgramDetailVisible() {
        AnimationSegment animationSegment = this.animationSegment;
        if ((animationSegment instanceof AnimationSegment.Entry) || (animationSegment instanceof AnimationSegment.UserInteraction) || (animationSegment instanceof AnimationSegment.EntryLoop) || animationSegment == null) {
            return false;
        }
        if ((animationSegment instanceof AnimationSegment.Exit) || (animationSegment instanceof AnimationSegment.ExitLoop) || (animationSegment instanceof AnimationSegment.CubesExit)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isFooterVisible() {
        AnimationSegment animationSegment = this.animationSegment;
        if ((animationSegment instanceof AnimationSegment.Entry) || (animationSegment instanceof AnimationSegment.UserInteraction) || (animationSegment instanceof AnimationSegment.EntryLoop) || (animationSegment instanceof AnimationSegment.Exit) || animationSegment == null) {
            return false;
        }
        if ((animationSegment instanceof AnimationSegment.ExitLoop) || (animationSegment instanceof AnimationSegment.CubesExit)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<ButtonWithColor> getFooterButtons() {
        ProgramDetail.ProgramDetailViewModel viewModel = getViewModel();
        if (viewModel != null) {
            List<GenericButton> footerButtons = viewModel.getFooterButtons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(footerButtons, 10));
            Iterator<T> it = footerButtons.iterator();
            while (it.hasNext()) {
                arrayList.add(new ButtonWithColor((GenericButton) it.next(), Color.parseColor(viewModel.getBackgroundColor())));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    public final float getTranslationProgress() {
        Float f = this.holdDownProgress;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float getIntroTextAlpha() {
        Float f = this.holdDownProgress;
        if (f == null) {
            return 1.0f;
        }
        return 1.0f - f.floatValue();
    }

    public final AnimationSegment getUserInteractionSegment() {
        ProgramDetail.Animation animation = getAnimation();
        if (animation != null) {
            return new AnimationSegment.UserInteraction(animation);
        }
        return null;
    }

    public final AnimationSegment getEntryLoopSegment() {
        ProgramDetail.Animation animation = getAnimation();
        if (animation != null) {
            return new AnimationSegment.EntryLoop(animation);
        }
        return null;
    }

    public final AnimationSegment getCubesExitSegment() {
        ProgramDetail.Animation animation = getAnimation();
        if (animation != null) {
            return new AnimationSegment.CubesExit(animation);
        }
        return null;
    }

    public final int getCubesLeftFrame() {
        ProgramDetail.Animation animation = getAnimation();
        if (animation != null) {
            return animation.getCubesTiltLeftFrame();
        }
        return 0;
    }

    public final int getCubesCenterFrame() {
        ProgramDetail.Animation animation = getAnimation();
        if (animation != null) {
            return animation.getCubesTiltCenterFrame();
        }
        return 0;
    }

    public final int getCubesRightFrame() {
        ProgramDetail.Animation animation = getAnimation();
        if (animation != null) {
            return animation.getCubesTiltRightFrame();
        }
        return 0;
    }

    public final AnimationSegment nextAnimationSegment() {
        ProgramDetail.Animation animation = getAnimation();
        if (animation == null) {
            return null;
        }
        AnimationSegment animationSegment = this.animationSegment;
        if (animationSegment instanceof AnimationSegment.Entry) {
            return new AnimationSegment.EntryLoop(animation);
        }
        if (animationSegment instanceof AnimationSegment.EntryLoop) {
            return new AnimationSegment.UserInteraction(animation);
        }
        if (animationSegment instanceof AnimationSegment.UserInteraction) {
            return new AnimationSegment.Exit(animation);
        }
        if (!(animationSegment instanceof AnimationSegment.Exit) && !(animationSegment instanceof AnimationSegment.ExitLoop)) {
            if (animationSegment == null) {
                return new AnimationSegment.Entry(animation);
            }
            if (animationSegment instanceof AnimationSegment.CubesExit) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return new AnimationSegment.ExitLoop(animation);
    }

    public final String footerText(Resources res) {
        Instant expirationTime;
        Intrinsics.checkNotNullParameter(res, "res");
        ProgramDetail.ProgramDetailViewModel viewModel = getViewModel();
        if (viewModel == null || (expirationTime = viewModel.getExpirationTime()) == null) {
            return null;
        }
        if (expirationTime.isBefore(Instant.now())) {
            return res.getString(C25966R.string.claim_expired);
        }
        Duration durationAbs = Durations.since(expirationTime).abs();
        Intrinsics.checkNotNull(durationAbs);
        Object daysHoursDuration = DurationFormatter2.formatDaysHoursDuration(durationAbs, res);
        if (daysHoursDuration == null) {
            daysHoursDuration = DurationFormatter.formatWide(durationAbs);
        }
        return res.getString(C25966R.string.time_left_to_claim, daysHoursDuration);
    }

    private final ProgramDetail.ProgramDetailViewModel getViewModel() {
        Result result = this.result;
        if ((result instanceof Result.Error) || Intrinsics.areEqual(result, Result.Loading.INSTANCE)) {
            return null;
        }
        if (result instanceof Result.Success) {
            return ((Result.Success) this.result).getViewModel();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: ProgramDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment;", "", "start", "", "end", "autoplay", "", "loop", "<init>", "(IIZZ)V", "getStart", "()I", "getEnd", "getAutoplay", "()Z", "getLoop", "Entry", "EntryLoop", "UserInteraction", "Exit", "ExitLoop", "CubesExit", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$CubesExit;", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$Entry;", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$EntryLoop;", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$Exit;", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$ExitLoop;", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$UserInteraction;", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class AnimationSegment {
        public static final int $stable = 0;
        private final boolean autoplay;
        private final int end;
        private final boolean loop;
        private final int start;

        public /* synthetic */ AnimationSegment(int i, int i2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, z, z2);
        }

        private AnimationSegment(int i, int i2, boolean z, boolean z2) {
            this.start = i;
            this.end = i2;
            this.autoplay = z;
            this.loop = z2;
        }

        public final int getStart() {
            return this.start;
        }

        public final int getEnd() {
            return this.end;
        }

        public final boolean getAutoplay() {
            return this.autoplay;
        }

        public final boolean getLoop() {
            return this.loop;
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$Entry;", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment;", "animation", "Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;", "<init>", "(Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;)V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Entry extends AnimationSegment {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Entry(ProgramDetail.Animation animation) {
                super(animation.getEntryStartFrame(), animation.getEntryEndFrame(), true, false, null);
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$EntryLoop;", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment;", "animation", "Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;", "<init>", "(Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;)V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EntryLoop extends AnimationSegment {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EntryLoop(ProgramDetail.Animation animation) {
                super(animation.getPostEntryLoopStartFrame(), animation.getPostEntryLoopEndFrame(), true, true, null);
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$UserInteraction;", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment;", "animation", "Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;", "<init>", "(Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;)V", "getAnimation", "()Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class UserInteraction extends AnimationSegment {
            public static final int $stable = 8;
            private final ProgramDetail.Animation animation;

            public final ProgramDetail.Animation getAnimation() {
                return this.animation;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserInteraction(ProgramDetail.Animation animation) {
                super(animation.getUserInteractionStartFrame(), animation.getUserInteractionEndFrame(), false, false, null);
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.animation = animation;
            }
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$Exit;", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment;", "animation", "Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;", "<init>", "(Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;)V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Exit extends AnimationSegment {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Exit(ProgramDetail.Animation animation) {
                super(animation.getExitStartFrame(), animation.getExitEndFrame(), true, false, null);
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$ExitLoop;", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment;", "animation", "Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;", "<init>", "(Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;)V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ExitLoop extends AnimationSegment {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExitLoop(ProgramDetail.Animation animation) {
                super(animation.getPostExitLoopStartFrame(), animation.getPostExitLoopEndFrame(), true, true, null);
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        }

        /* compiled from: ProgramDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment$CubesExit;", "Lcom/robinhood/android/psp/ProgramDetailViewState$AnimationSegment;", "animation", "Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;", "<init>", "(Lcom/robinhood/models/db/bonfire/ProgramDetail$Animation;)V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CubesExit extends AnimationSegment {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CubesExit(ProgramDetail.Animation animation) {
                super(animation.getCubesExitStartFrame(), animation.getCubesExitEndFrame(), true, false, null);
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        }
    }
}
