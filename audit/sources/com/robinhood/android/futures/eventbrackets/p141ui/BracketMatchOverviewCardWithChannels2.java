package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: BracketMatchOverviewCardWithChannels.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchOverviewCardWithChannelsPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchOverviewCardWithChannelsPreviewParameterProvider$PreviewData;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "PreviewData", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannelsPreviewParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class BracketMatchOverviewCardWithChannels2 implements PreviewParameterProvider<PreviewData> {
    public static final int $stable = 0;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    /* compiled from: BracketMatchOverviewCardWithChannels.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchOverviewCardWithChannelsPreviewParameterProvider$PreviewData;", "", "displayInChannel", "", "displayOutChannelDirection", "Lcom/robinhood/android/futures/eventbrackets/ui/ChannelDirection;", "<init>", "(ZLcom/robinhood/android/futures/eventbrackets/ui/ChannelDirection;)V", "getDisplayInChannel", "()Z", "getDisplayOutChannelDirection", "()Lcom/robinhood/android/futures/eventbrackets/ui/ChannelDirection;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardWithChannelsPreviewParameterProvider$PreviewData, reason: from toString */
    public static final /* data */ class PreviewData {
        public static final int $stable = 0;
        private final boolean displayInChannel;
        private final BracketMatchOverviewCardWithChannels3 displayOutChannelDirection;

        public static /* synthetic */ PreviewData copy$default(PreviewData previewData, boolean z, BracketMatchOverviewCardWithChannels3 bracketMatchOverviewCardWithChannels3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = previewData.displayInChannel;
            }
            if ((i & 2) != 0) {
                bracketMatchOverviewCardWithChannels3 = previewData.displayOutChannelDirection;
            }
            return previewData.copy(z, bracketMatchOverviewCardWithChannels3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getDisplayInChannel() {
            return this.displayInChannel;
        }

        /* renamed from: component2, reason: from getter */
        public final BracketMatchOverviewCardWithChannels3 getDisplayOutChannelDirection() {
            return this.displayOutChannelDirection;
        }

        public final PreviewData copy(boolean displayInChannel, BracketMatchOverviewCardWithChannels3 displayOutChannelDirection) {
            return new PreviewData(displayInChannel, displayOutChannelDirection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewData)) {
                return false;
            }
            PreviewData previewData = (PreviewData) other;
            return this.displayInChannel == previewData.displayInChannel && this.displayOutChannelDirection == previewData.displayOutChannelDirection;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.displayInChannel) * 31;
            BracketMatchOverviewCardWithChannels3 bracketMatchOverviewCardWithChannels3 = this.displayOutChannelDirection;
            return iHashCode + (bracketMatchOverviewCardWithChannels3 == null ? 0 : bracketMatchOverviewCardWithChannels3.hashCode());
        }

        public String toString() {
            return "PreviewData(displayInChannel=" + this.displayInChannel + ", displayOutChannelDirection=" + this.displayOutChannelDirection + ")";
        }

        public PreviewData(boolean z, BracketMatchOverviewCardWithChannels3 bracketMatchOverviewCardWithChannels3) {
            this.displayInChannel = z;
            this.displayOutChannelDirection = bracketMatchOverviewCardWithChannels3;
        }

        public final boolean getDisplayInChannel() {
            return this.displayInChannel;
        }

        public final BracketMatchOverviewCardWithChannels3 getDisplayOutChannelDirection() {
            return this.displayOutChannelDirection;
        }
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<PreviewData> getValues() {
        return SequencesKt.sequenceOf(new PreviewData(true, BracketMatchOverviewCardWithChannels3.DOWN), new PreviewData(false, null), new PreviewData(true, null), new PreviewData(false, BracketMatchOverviewCardWithChannels3.f4154UP));
    }
}
