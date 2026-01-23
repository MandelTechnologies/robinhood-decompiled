package com.robinhood.android.search.newsfeed.videoplayer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NewsFeedPortraitVideoPlayerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.videoplayer.NewsFeedPortraitVideoPlayerFragment$onViewCreated$2$6, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class NewsFeedPortraitVideoPlayerFragment5 extends FunctionReferenceImpl implements Function1<Integer, Video> {
    NewsFeedPortraitVideoPlayerFragment5(Object obj) {
        super(1, obj, NewsFeedVideoPlayerAdapter.class, "getItem", "getItem(I)Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", 0);
    }

    public final Video invoke(int i) {
        return ((NewsFeedVideoPlayerAdapter) this.receiver).getItem(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Video invoke(Integer num) {
        return invoke(num.intValue());
    }
}
