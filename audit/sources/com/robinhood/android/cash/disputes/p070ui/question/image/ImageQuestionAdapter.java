package com.robinhood.android.cash.disputes.p070ui.question.image;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.p070ui.question.image.ImageQuestionAdapter;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageQuestionAdapter.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002()B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\u0010\t\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u001c\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0010J\u0014\u0010\"\u001a\u00020\u001d2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013J\u0006\u0010$\u001a\u00020\u001dJ\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0010H\u0002J\b\u0010'\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nj\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionAdapter$FileViewHolder;", "callbacks", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionAdapter$Callbacks;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionAdapter$Callbacks;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;)V", "itemList", "", "Lcom/robinhood/android/cash/disputes/ui/question/image/FileSelectionItem;", "selectedFilesRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "getSelectedFilesRelay", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "addItem", "file", "addPreFillItemsIfEmpty", "files", "clearItems", "removeItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "updateRelay", "Callbacks", "FileViewHolder", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ImageQuestionAdapter extends RecyclerView.Adapter<FileViewHolder> {
    public static final int $stable = 8;
    private final Callbacks callbacks;
    private final Context eventContext;
    private final EventLogger eventLogger;
    private final Screen eventScreen;
    private final List<FileSelectionItem> itemList;
    private final BehaviorRelay<List<FileSelectionItem>> selectedFilesRelay;

    /* compiled from: ImageQuestionAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionAdapter$Callbacks;", "", "onFileItemClicked", "", "fileSelectionItem", "Lcom/robinhood/android/cash/disputes/ui/question/image/FileSelectionItem;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFileItemClicked(FileSelectionItem fileSelectionItem);
    }

    public ImageQuestionAdapter(Callbacks callbacks, EventLogger eventLogger, Screen eventScreen, Context eventContext) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        this.callbacks = callbacks;
        this.eventLogger = eventLogger;
        this.eventScreen = eventScreen;
        this.eventContext = eventContext;
        this.itemList = new ArrayList();
        BehaviorRelay<List<FileSelectionItem>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.selectedFilesRelay = behaviorRelayCreateDefault;
    }

    public final BehaviorRelay<List<FileSelectionItem>> getSelectedFilesRelay() {
        return this.selectedFilesRelay;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.itemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public FileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C10007R.layout.include_file_selection_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new FileViewHolder(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(FileViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.itemList.get(position));
    }

    public final void addItem(FileSelectionItem file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.itemList.add(file);
        notifyItemInserted(this.itemList.size() - 1);
        updateRelay();
    }

    public final void addPreFillItemsIfEmpty(List<FileSelectionItem> files) {
        Intrinsics.checkNotNullParameter(files, "files");
        if (this.itemList.isEmpty()) {
            this.itemList.addAll(files);
            notifyDataSetChanged();
            updateRelay();
        }
    }

    public final void clearItems() {
        this.itemList.clear();
        notifyDataSetChanged();
        updateRelay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeItem(FileSelectionItem item) {
        int iIndexOf = this.itemList.indexOf(item);
        this.itemList.remove(iIndexOf);
        notifyItemRemoved(iIndexOf);
        updateRelay();
    }

    /* compiled from: ImageQuestionAdapter.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionAdapter$FileViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionAdapter;Landroid/view/View;)V", "layoutRoot", "Landroid/view/ViewGroup;", "thumbnailImage", "Landroid/widget/ImageView;", "nameText", "Landroid/widget/TextView;", "removeIcon", "bind", "", "fileSelectionItem", "Lcom/robinhood/android/cash/disputes/ui/question/image/FileSelectionItem;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public final class FileViewHolder extends RecyclerView.ViewHolder {
        private final ViewGroup layoutRoot;
        private final TextView nameText;
        private final ImageView removeIcon;
        final /* synthetic */ ImageQuestionAdapter this$0;
        private final ImageView thumbnailImage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileViewHolder(ImageQuestionAdapter imageQuestionAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = imageQuestionAdapter;
            View viewFindViewById = view.findViewById(C10007R.id.file_selection_item_layout);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.layoutRoot = (ViewGroup) viewFindViewById;
            View viewFindViewById2 = view.findViewById(C10007R.id.file_selection_item_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.thumbnailImage = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(C10007R.id.file_selection_item_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.nameText = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(C10007R.id.file_selection_item_remove_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.removeIcon = (ImageView) viewFindViewById4;
        }

        public final void bind(final FileSelectionItem fileSelectionItem) {
            Intrinsics.checkNotNullParameter(fileSelectionItem, "fileSelectionItem");
            ViewGroup viewGroup = this.layoutRoot;
            final ImageQuestionAdapter imageQuestionAdapter = this.this$0;
            OnClickListeners.onClick(viewGroup, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionAdapter$FileViewHolder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImageQuestionAdapter.FileViewHolder.bind$lambda$0(imageQuestionAdapter, this, fileSelectionItem);
                }
            });
            ImageView imageView = this.thumbnailImage;
            imageView.setImageBitmap(fileSelectionItem.getBitmap());
            imageView.setClipToOutline(true);
            this.nameText.setText(fileSelectionItem.getName());
            ImageView imageView2 = this.removeIcon;
            final ImageQuestionAdapter imageQuestionAdapter2 = this.this$0;
            OnClickListeners.onClick(imageView2, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionAdapter$FileViewHolder$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImageQuestionAdapter.FileViewHolder.bind$lambda$2(imageQuestionAdapter2, this, fileSelectionItem);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$0(ImageQuestionAdapter imageQuestionAdapter, FileViewHolder fileViewHolder, FileSelectionItem fileSelectionItem) {
            EventLogger eventLogger = imageQuestionAdapter.eventLogger;
            Screen screen = imageQuestionAdapter.eventScreen;
            Context context = imageQuestionAdapter.eventContext;
            Component.ComponentType componentType = Component.ComponentType.ROW;
            String string2 = fileViewHolder.layoutRoot.getContext().getString(C10007R.string.dispute_logging_id_media_preview_row);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(componentType, string2, null, 4, null), null, context, false, 41, null);
            imageQuestionAdapter.callbacks.onFileItemClicked(fileSelectionItem);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$2(ImageQuestionAdapter imageQuestionAdapter, FileViewHolder fileViewHolder, FileSelectionItem fileSelectionItem) {
            EventLogger eventLogger = imageQuestionAdapter.eventLogger;
            Screen screen = imageQuestionAdapter.eventScreen;
            Context context = imageQuestionAdapter.eventContext;
            Component.ComponentType componentType = Component.ComponentType.DELETE_BUTTON;
            String string2 = fileViewHolder.layoutRoot.getContext().getString(C10007R.string.dispute_logging_id_media_remove_item);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(componentType, string2, null, 4, null), null, context, false, 41, null);
            fileViewHolder.removeIcon.setOnClickListener(null);
            imageQuestionAdapter.removeItem(fileSelectionItem);
            return Unit.INSTANCE;
        }
    }

    private final void updateRelay() {
        this.selectedFilesRelay.accept(this.itemList);
    }
}
