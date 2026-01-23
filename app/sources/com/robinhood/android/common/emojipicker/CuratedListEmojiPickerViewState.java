package com.robinhood.android.common.emojipicker;

import com.robinhood.android.common.emojipicker.CuratedListEmojiPickerViewState2;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CuratedListEmojiPickerViewState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fH\u0002J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J)\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u001cHÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerViewState;", "", "emojiGroups", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/common/emojipicker/EmojiGroup;", "expandedGroupLabels", "", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/util/Set;)V", "getEmojiGroups", "()Lkotlinx/collections/immutable/ImmutableList;", "getExpandedGroupLabels", "()Ljava/util/Set;", "emojiList", "", "Lcom/robinhood/android/common/emojipicker/UiEmojiItem;", "getEmojiList", "()Ljava/util/List;", "createEmojiSequence", "Lkotlin/sequences/Sequence;", "Lcom/robinhood/android/common/emojipicker/UiEmojiItem$Item;", AnnotatedPrivateKey.LABEL, "emojis", "Lcom/robinhood/android/common/emojipicker/Emoji;", "createFooterSequence", "Lcom/robinhood/android/common/emojipicker/UiEmojiItem$ExpandFooter;", "emojiCount", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CuratedListEmojiPickerViewState {
    public static final int EMOJI_LIST_COLUMN_COUNT = 6;
    public static final int EMOJI_LIST_VISIBLE_ROW_COUNT = 4;
    private final ImmutableList<EmojiGroup> emojiGroups;
    private final List<CuratedListEmojiPickerViewState2> emojiList;
    private final Set<String> expandedGroupLabels;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public CuratedListEmojiPickerViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CuratedListEmojiPickerViewState copy$default(CuratedListEmojiPickerViewState curatedListEmojiPickerViewState, ImmutableList immutableList, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = curatedListEmojiPickerViewState.emojiGroups;
        }
        if ((i & 2) != 0) {
            set = curatedListEmojiPickerViewState.expandedGroupLabels;
        }
        return curatedListEmojiPickerViewState.copy(immutableList, set);
    }

    public final ImmutableList<EmojiGroup> component1() {
        return this.emojiGroups;
    }

    public final Set<String> component2() {
        return this.expandedGroupLabels;
    }

    public final CuratedListEmojiPickerViewState copy(ImmutableList<EmojiGroup> emojiGroups, Set<String> expandedGroupLabels) {
        Intrinsics.checkNotNullParameter(emojiGroups, "emojiGroups");
        Intrinsics.checkNotNullParameter(expandedGroupLabels, "expandedGroupLabels");
        return new CuratedListEmojiPickerViewState(emojiGroups, expandedGroupLabels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CuratedListEmojiPickerViewState)) {
            return false;
        }
        CuratedListEmojiPickerViewState curatedListEmojiPickerViewState = (CuratedListEmojiPickerViewState) other;
        return Intrinsics.areEqual(this.emojiGroups, curatedListEmojiPickerViewState.emojiGroups) && Intrinsics.areEqual(this.expandedGroupLabels, curatedListEmojiPickerViewState.expandedGroupLabels);
    }

    public int hashCode() {
        return (this.emojiGroups.hashCode() * 31) + this.expandedGroupLabels.hashCode();
    }

    public String toString() {
        return "CuratedListEmojiPickerViewState(emojiGroups=" + this.emojiGroups + ", expandedGroupLabels=" + this.expandedGroupLabels + ")";
    }

    public CuratedListEmojiPickerViewState(ImmutableList<EmojiGroup> emojiGroups, Set<String> expandedGroupLabels) {
        Intrinsics.checkNotNullParameter(emojiGroups, "emojiGroups");
        Intrinsics.checkNotNullParameter(expandedGroupLabels, "expandedGroupLabels");
        this.emojiGroups = emojiGroups;
        this.expandedGroupLabels = expandedGroupLabels;
        this.emojiList = SequencesKt.toList(SequencesKt.flatMap(CollectionsKt.asSequence(emojiGroups), new Function1() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListEmojiPickerViewState.emojiList$lambda$0(this.f$0, (EmojiGroup) obj);
            }
        }));
    }

    public /* synthetic */ CuratedListEmojiPickerViewState(ImmutableList immutableList, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.persistentListOf() : immutableList, (i & 2) != 0 ? SetsKt.emptySet() : set);
    }

    public final ImmutableList<EmojiGroup> getEmojiGroups() {
        return this.emojiGroups;
    }

    public final Set<String> getExpandedGroupLabels() {
        return this.expandedGroupLabels;
    }

    public final List<CuratedListEmojiPickerViewState2> getEmojiList() {
        return this.emojiList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence emojiList$lambda$0(CuratedListEmojiPickerViewState curatedListEmojiPickerViewState, EmojiGroup emojiGroup) {
        Intrinsics.checkNotNullParameter(emojiGroup, "<destruct>");
        String title = emojiGroup.getTitle();
        List<Emoji> listComponent2 = emojiGroup.component2();
        Sequence sequenceSequenceOf = SequencesKt.sequenceOf(new CuratedListEmojiPickerViewState2.Header(title));
        Sequence<CuratedListEmojiPickerViewState2.Item> sequenceCreateEmojiSequence = curatedListEmojiPickerViewState.createEmojiSequence(title, listComponent2);
        return SequencesKt.plus(SequencesKt.plus(sequenceSequenceOf, (Sequence) sequenceCreateEmojiSequence), (Sequence) curatedListEmojiPickerViewState.createFooterSequence(title, listComponent2.size()));
    }

    private final Sequence<CuratedListEmojiPickerViewState2.Item> createEmojiSequence(final String label, List<Emoji> emojis) {
        final int i = 24;
        return SequencesKt.map(SequencesKt.filterIndexed(CollectionsKt.asSequence(emojis), new Function2() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerViewState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(CuratedListEmojiPickerViewState.createEmojiSequence$lambda$1(this.f$0, label, i, ((Integer) obj).intValue(), (Emoji) obj2));
            }
        }), new Function1() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerViewState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListEmojiPickerViewState.createEmojiSequence$lambda$2((Emoji) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createEmojiSequence$lambda$1(CuratedListEmojiPickerViewState curatedListEmojiPickerViewState, String str, int i, int i2, Emoji emoji) {
        Intrinsics.checkNotNullParameter(emoji, "<unused var>");
        return curatedListEmojiPickerViewState.expandedGroupLabels.contains(str) || i2 < i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListEmojiPickerViewState2.Item createEmojiSequence$lambda$2(Emoji emoji) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        return new CuratedListEmojiPickerViewState2.Item(emoji);
    }

    private final Sequence<CuratedListEmojiPickerViewState2.ExpandFooter> createFooterSequence(String label, int emojiCount) {
        return (this.expandedGroupLabels.contains(label) || emojiCount < 24) ? SequencesKt.emptySequence() : SequencesKt.sequenceOf(new CuratedListEmojiPickerViewState2.ExpandFooter(label));
    }
}
