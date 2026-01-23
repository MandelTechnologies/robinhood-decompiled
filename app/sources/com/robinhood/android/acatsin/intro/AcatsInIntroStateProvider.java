package com.robinhood.android.acatsin.intro;

import com.airbnb.lottie.compose.LottieClipSpec;
import com.robinhood.android.acatsin.intro.AcatsInIntroViewState;
import com.robinhood.android.acatsin.intro.PagedLottie;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.ApiAcatsWelcomeContents;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AcatsInIntroStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsInIntroStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroDataState;", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState;", "<init>", "()V", "reduce", "dataState", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInIntroStateProvider implements StateProvider<AcatsInIntroDataState, AcatsInIntroViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AcatsInIntroViewState reduce(AcatsInIntroDataState dataState) {
        LottieClipSpec.Frame frame;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ImmutableList<ImmutableList<UIComponent<GenericAction>>> pages = dataState.getPages();
        if (pages == null || pages.isEmpty() || dataState.getLottieSpecs() == null || dataState.getLottieUrl() == null) {
            return new AcatsInIntroViewState.Loading(dataState.getBackEvent(), dataState.getForwardEvent());
        }
        ImmutableList<ImmutableList<UIComponent<GenericAction>>> pages2 = dataState.getPages();
        int pageIndex = dataState.getPageIndex();
        UiEvent<Integer> backEvent = dataState.getBackEvent();
        UiEvent<Integer> forwardEvent = dataState.getForwardEvent();
        boolean bonusShown = dataState.getBonusShown();
        String lottieUrl = dataState.getLottieUrl();
        List<ApiAcatsWelcomeContents.LottieSpec> lottieSpecs = dataState.getLottieSpecs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lottieSpecs, 10));
        for (ApiAcatsWelcomeContents.LottieSpec lottieSpec : lottieSpecs) {
            LottieClipSpec.Frame frame2 = new LottieClipSpec.Frame(Integer.valueOf(lottieSpec.getStartFrame()), Integer.valueOf(lottieSpec.getEndFrame()), false, 4, null);
            if (lottieSpec.isLooped()) {
                Integer loopStartFrame = lottieSpec.getLoopStartFrame();
                if (loopStartFrame == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Integer loopEndFrame = lottieSpec.getLoopEndFrame();
                if (loopEndFrame == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                frame = new LottieClipSpec.Frame(loopStartFrame, loopEndFrame, false, 4, null);
            } else {
                frame = null;
            }
            arrayList.add(new PagedLottie.Frame(frame2, frame));
        }
        List<ApiAcatsWelcomeContents.LottieSpec> lottieSpecs2 = dataState.getLottieSpecs();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(lottieSpecs2, 10));
        Iterator<T> it = lottieSpecs2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ApiAcatsWelcomeContents.LottieSpec) it.next()).getOverrideImageUrl());
        }
        return new AcatsInIntroViewState.Ready(pages2, pageIndex, backEvent, forwardEvent, bonusShown, lottieUrl, arrayList, arrayList2);
    }
}
