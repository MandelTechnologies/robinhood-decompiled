package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import coil.ImageLoader;
import coil.content.CoilUtils;
import coil.request.ImageRequest;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentTileAdapter;
import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentReviewAddDocumentTileBinding;
import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentReviewDocumentTileBinding;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.R$drawable;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder2;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ImageStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;
import kotlin.ranges.RangesKt;

/* compiled from: DocumentTileAdapter.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001cH\u0016¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u00104R\u001c\u00107\u001a\n 6*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "context", "Lcoil/ImageLoader;", "imageLoader", "Lkotlin/Function0;", "", "onClickAddButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "<init>", "(Landroid/content/Context;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V", "", "addButtonEnabled", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item;", "generateItems", "(ZLjava/util/List;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewDocumentTileBinding;", "binding", "applyStyles", "(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewDocumentTileBinding;)V", "Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewAddDocumentTileBinding;", "(Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2DocumentReviewAddDocumentTileBinding;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemCount", "()I", "update", "(ZLjava/util/List;)V", "Lcoil/ImageLoader;", "getImageLoader", "()Lcoil/ImageLoader;", "Lkotlin/jvm/functions/Function0;", "getOnClickAddButton", "()Lkotlin/jvm/functions/Function0;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "items", "Ljava/util/List;", "Lkotlin/Function1;", "removeDocument", "Lkotlin/jvm/functions/Function1;", "getRemoveDocument", "()Lkotlin/jvm/functions/Function1;", "setRemoveDocument", "(Lkotlin/jvm/functions/Function1;)V", "Item", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class DocumentTileAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final ImageLoader imageLoader;
    private final LayoutInflater inflater;
    private List<? extends Item> items;
    private final Function0<Unit> onClickAddButton;
    private Function1<? super DocumentFile, Unit> removeDocument;
    private final StepStyles.DocumentStepStyle styles;

    public DocumentTileAdapter(Context context, ImageLoader imageLoader, Function0<Unit> onClickAddButton, StepStyles.DocumentStepStyle documentStepStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onClickAddButton, "onClickAddButton");
        this.imageLoader = imageLoader;
        this.onClickAddButton = onClickAddButton;
        this.styles = documentStepStyle;
        this.inflater = LayoutInflater.from(context);
        this.items = CollectionsKt.emptyList();
    }

    public final void setRemoveDocument(Function1<? super DocumentFile, Unit> function1) {
        this.removeDocument = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        Item item = this.items.get(position);
        if (item instanceof Item.AddButtonItem) {
            return R$layout.pi2_document_review_add_document_tile;
        }
        if (item instanceof Item.DocumentItem) {
            return R$layout.pi2_document_review_document_tile;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) throws IllegalArgumentException {
        LottieComposition value;
        LottieComposition value2;
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = this.inflater.inflate(viewType, parent, false);
        if (viewType == R$layout.pi2_document_review_add_document_tile) {
            Pi2DocumentReviewAddDocumentTileBinding pi2DocumentReviewAddDocumentTileBindingBind = Pi2DocumentReviewAddDocumentTileBinding.bind(viewInflate);
            Intrinsics.checkNotNullExpressionValue(pi2DocumentReviewAddDocumentTileBindingBind, "bind(...)");
            ViewBindingViewHolder viewBindingViewHolder = new ViewBindingViewHolder(pi2DocumentReviewAddDocumentTileBindingBind);
            LottieResult<LottieComposition> lottieResultFromRawResSync = LottieCompositionFactory.fromRawResSync(((Pi2DocumentReviewAddDocumentTileBinding) viewBindingViewHolder.getBinding()).getRoot().getContext(), R$raw.pi2_add_document_button);
            if (lottieResultFromRawResSync != null && (value2 = lottieResultFromRawResSync.getValue()) != null) {
                ((Pi2DocumentReviewAddDocumentTileBinding) viewBindingViewHolder.getBinding()).addButton.setComposition(value2);
            }
            ViewBinding binding = viewBindingViewHolder.getBinding();
            Intrinsics.checkNotNullExpressionValue(binding, "<get-binding>(...)");
            applyStyles((Pi2DocumentReviewAddDocumentTileBinding) binding);
            return viewBindingViewHolder;
        }
        if (viewType == R$layout.pi2_document_review_document_tile) {
            Pi2DocumentReviewDocumentTileBinding pi2DocumentReviewDocumentTileBindingBind = Pi2DocumentReviewDocumentTileBinding.bind(viewInflate);
            Intrinsics.checkNotNullExpressionValue(pi2DocumentReviewDocumentTileBindingBind, "bind(...)");
            ViewBindingViewHolder viewBindingViewHolder2 = new ViewBindingViewHolder(pi2DocumentReviewDocumentTileBindingBind);
            LottieResult<LottieComposition> lottieResultFromRawResSync2 = LottieCompositionFactory.fromRawResSync(((Pi2DocumentReviewDocumentTileBinding) viewBindingViewHolder2.getBinding()).getRoot().getContext(), R$raw.pi2_remove_document_button);
            if (lottieResultFromRawResSync2 != null && (value = lottieResultFromRawResSync2.getValue()) != null) {
                ((Pi2DocumentReviewDocumentTileBinding) viewBindingViewHolder2.getBinding()).removeButton.setComposition(value);
            }
            ViewBinding binding2 = viewBindingViewHolder2.getBinding();
            Intrinsics.checkNotNullExpressionValue(binding2, "<get-binding>(...)");
            applyStyles((Pi2DocumentReviewDocumentTileBinding) binding2);
            return viewBindingViewHolder2;
        }
        throw new IllegalStateException(("Unknown view type " + viewType).toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final Item item = this.items.get(position);
        if (item instanceof Item.AddButtonItem) {
            ((Pi2DocumentReviewAddDocumentTileBinding) ViewBindingViewHolder2.getBinding(holder)).addButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.document.DocumentTileAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DocumentTileAdapter.onBindViewHolder$lambda$4(this.f$0, view);
                }
            });
            return;
        }
        if (!(item instanceof Item.DocumentItem)) {
            throw new NoWhenBranchMatchedException();
        }
        Pi2DocumentReviewDocumentTileBinding pi2DocumentReviewDocumentTileBinding = (Pi2DocumentReviewDocumentTileBinding) ViewBindingViewHolder2.getBinding(holder);
        pi2DocumentReviewDocumentTileBinding.removeButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.document.DocumentTileAdapter$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DocumentTileAdapter.onBindViewHolder$lambda$5(this.f$0, item, view);
            }
        });
        ImageView imageView = pi2DocumentReviewDocumentTileBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        CoilUtils.dispose(imageView);
        pi2DocumentReviewDocumentTileBinding.imageView.setImageDrawable(null);
        Item.DocumentItem documentItem = (Item.DocumentItem) item;
        if (documentItem instanceof Item.DocumentItem.Local) {
            Item.DocumentItem.Local local = (Item.DocumentItem.Local) item;
            pi2DocumentReviewDocumentTileBinding.imageView.setVisibility(local.getDocument().getUploadProgress() < 100 ? 4 : 0);
            pi2DocumentReviewDocumentTileBinding.removeButton.setVisibility(8);
            pi2DocumentReviewDocumentTileBinding.filenameView.setText(local.getFile().getName());
            pi2DocumentReviewDocumentTileBinding.loadingAnimation.setVisibility(local.getDocument().getUploadProgress() < 100 ? 0 : 8);
            pi2DocumentReviewDocumentTileBinding.loadingAnimation.setProgress(local.getDocument().getUploadProgress());
            return;
        }
        if (!(documentItem instanceof Item.DocumentItem.Remote)) {
            throw new NoWhenBranchMatchedException();
        }
        pi2DocumentReviewDocumentTileBinding.imageView.setVisibility(0);
        Item.DocumentItem.Remote remote = (Item.DocumentItem.Remote) item;
        if (Intrinsics.areEqual(remote.getMimeType(), "application/pdf")) {
            ImageView imageView2 = pi2DocumentReviewDocumentTileBinding.imageView;
            Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
            Integer numValueOf = Integer.valueOf(R$drawable.pi2_ic_file_pdf);
            ImageLoader imageLoader = this.imageLoader;
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView2.getContext()).data(numValueOf).target(imageView2);
            builderTarget.size(100, 100);
            imageLoader.enqueue(builderTarget.build());
        } else {
            ImageView imageView3 = pi2DocumentReviewDocumentTileBinding.imageView;
            Intrinsics.checkNotNullExpressionValue(imageView3, "imageView");
            String remoteUrl = remote.getRemoteUrl();
            ImageLoader imageLoader2 = this.imageLoader;
            ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(imageView3.getContext()).data(remoteUrl).target(imageView3);
            builderTarget2.crossfade(true);
            builderTarget2.crossfade(100);
            builderTarget2.size(500, 500);
            imageLoader2.enqueue(builderTarget2.build());
        }
        pi2DocumentReviewDocumentTileBinding.loadingAnimation.setVisibility(8);
        pi2DocumentReviewDocumentTileBinding.removeButton.setVisibility(0);
        pi2DocumentReviewDocumentTileBinding.filenameView.setText(remote.getFilename());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(DocumentTileAdapter documentTileAdapter, View view) {
        documentTileAdapter.onClickAddButton.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$5(DocumentTileAdapter documentTileAdapter, Item item, View view) {
        Function1<? super DocumentFile, Unit> function1 = documentTileAdapter.removeDocument;
        if (function1 != null) {
            function1.invoke(((Item.DocumentItem) item).getDocument());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.items.size();
    }

    public final void update(boolean addButtonEnabled, List<? extends DocumentFile> documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        final List<Item> listGenerateItems = generateItems(addButtonEnabled, documents);
        final List<? extends Item> list = this.items;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: com.withpersona.sdk2.inquiry.document.DocumentTileAdapter$update$diff$1
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            /* renamed from: getOldListSize */
            public int get$oldSize() {
                return list.size();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            /* renamed from: getNewListSize */
            public int get$newSize() {
                return listGenerateItems.size();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                DocumentTileAdapter.Item item = list.get(oldItemPosition);
                DocumentTileAdapter.Item item2 = listGenerateItems.get(newItemPosition);
                if (item.getClass() != item2.getClass()) {
                    return false;
                }
                if (item instanceof DocumentTileAdapter.Item.AddButtonItem) {
                    return true;
                }
                if (item instanceof DocumentTileAdapter.Item.DocumentItem.Local) {
                    String absolutePath = ((DocumentTileAdapter.Item.DocumentItem.Local) item).getFile().getAbsolutePath();
                    Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem.Local");
                    return Intrinsics.areEqual(absolutePath, ((DocumentTileAdapter.Item.DocumentItem.Local) item2).getFile().getAbsolutePath());
                }
                if (!(item instanceof DocumentTileAdapter.Item.DocumentItem.Remote)) {
                    throw new NoWhenBranchMatchedException();
                }
                String remoteUrl = ((DocumentTileAdapter.Item.DocumentItem.Remote) item).getRemoteUrl();
                Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem.Remote");
                return Intrinsics.areEqual(remoteUrl, ((DocumentTileAdapter.Item.DocumentItem.Remote) item2).getRemoteUrl());
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                boolean zAreEqual;
                DocumentTileAdapter.Item item = list.get(oldItemPosition);
                DocumentTileAdapter.Item item2 = listGenerateItems.get(newItemPosition);
                if (!areItemsTheSame(oldItemPosition, newItemPosition)) {
                    return false;
                }
                if (item instanceof DocumentTileAdapter.Item.AddButtonItem) {
                    zAreEqual = Intrinsics.areEqual(item, item2);
                } else {
                    if (!(item instanceof DocumentTileAdapter.Item.DocumentItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zAreEqual = true;
                }
                return zAreEqual;
            }
        });
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "calculateDiff(...)");
        this.items = listGenerateItems;
        diffResultCalculateDiff.dispatchUpdatesTo(this);
        List<? extends Item> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(obj, (Item) obj);
        }
        for (IndexedValue indexedValue : CollectionsKt.withIndex(listGenerateItems)) {
            int index = indexedValue.getIndex();
            Item item = (Item) indexedValue.component2();
            Item item2 = (Item) linkedHashMap.get(item);
            if ((item2 instanceof Item.DocumentItem.Local) && (item instanceof Item.DocumentItem.Local)) {
                Item.DocumentItem.Local local = (Item.DocumentItem.Local) item;
                if (((Item.DocumentItem.Local) item2).getDocument().getUploadProgress() != local.getDocument().getUploadProgress()) {
                    if (local.getDocument().getUploadProgress() == 100) {
                        notifyItemChanged(index);
                    } else {
                        notifyItemChanged(index, Unit.INSTANCE);
                    }
                }
            }
        }
    }

    private final List<Item> generateItems(boolean addButtonEnabled, List<? extends DocumentFile> documents) {
        Object remote;
        ArrayList arrayList = new ArrayList();
        for (DocumentFile documentFile : documents) {
            if (documentFile instanceof DocumentFile.Local) {
                DocumentFile.Local local = (DocumentFile.Local) documentFile;
                File file = new File(local.getAbsoluteFilePath());
                remote = new Item.DocumentItem.Local(file, local, MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(file)));
            } else {
                if (!(documentFile instanceof DocumentFile.Remote)) {
                    throw new NoWhenBranchMatchedException();
                }
                DocumentFile.Remote remote2 = (DocumentFile.Remote) documentFile;
                remote = new Item.DocumentItem.Remote(remote2.getRemoteUrl(), remote2.getFilename(), remote2, MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(remote2.getRemoteUrl())));
            }
            arrayList.add(remote);
        }
        if (addButtonEnabled) {
            arrayList.add(new Item.AddButtonItem());
        }
        return arrayList;
    }

    private final void applyStyles(Pi2DocumentReviewDocumentTileBinding binding) throws IllegalArgumentException {
        StepStyles.DocumentStepStyle documentStepStyle = this.styles;
        if (documentStepStyle == null) {
            return;
        }
        Integer strokeColorValue = documentStepStyle.getStrokeColorValue();
        if (strokeColorValue != null) {
            binding.loadingAnimation.setIndicatorColor(strokeColorValue.intValue());
        }
        Integer fillColorValue = this.styles.getFillColorValue();
        if (fillColorValue != null) {
            binding.loadingAnimation.setTrackColor(fillColorValue.intValue());
        }
        Integer imagePreviewCropAreaFillColor = this.styles.getImagePreviewCropAreaFillColor();
        if (imagePreviewCropAreaFillColor != null) {
            binding.imageView.setBackgroundColor(imagePreviewCropAreaFillColor.intValue());
        }
        Double imagePreviewBorderRadius = this.styles.getImagePreviewBorderRadius();
        if (imagePreviewBorderRadius != null) {
            binding.cardView.setRadius((float) ExtensionsKt.getDpToPx(imagePreviewBorderRadius.doubleValue()));
        }
        Double imagePreviewBorderWidth = this.styles.getImagePreviewBorderWidth();
        if (imagePreviewBorderWidth != null) {
            binding.cardView.setStrokeWidth((int) Math.ceil(ExtensionsKt.getDpToPx(imagePreviewBorderWidth.doubleValue())));
        }
        Integer imagePreviewBorderColor = this.styles.getImagePreviewBorderColor();
        if (imagePreviewBorderColor != null) {
            binding.cardView.setStrokeColor(imagePreviewBorderColor.intValue());
        }
        TextBasedComponentStyle imageNameStyleValue = this.styles.getImageNameStyleValue();
        if (imageNameStyleValue != null) {
            TextView filenameView = binding.filenameView;
            Intrinsics.checkNotNullExpressionValue(filenameView, "filenameView");
            TextStyling2.style$default(filenameView, imageNameStyleValue, null, 2, null);
        }
        Integer imagePreviewMainAreaFillColor = this.styles.getImagePreviewMainAreaFillColor();
        if (imagePreviewMainAreaFillColor != null) {
            binding.imageViewContainer.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
        }
        ThemeableLottieAnimationView removeButton = binding.removeButton;
        Intrinsics.checkNotNullExpressionValue(removeButton, "removeButton");
        ImageStyling.replaceColors(removeButton, this.styles.getImagePreviewXIconStrokeColor(), this.styles.getImagePreviewXIconFillColor(), null, new String[]{"#6B6D82"}, new String[]{"#FFFFFF"}, new String[0]);
    }

    private final void applyStyles(Pi2DocumentReviewAddDocumentTileBinding binding) {
        StepStyles.DocumentStepStyle documentStepStyle = this.styles;
        if (documentStepStyle == null) {
            return;
        }
        Double imagePreviewBorderRadius = documentStepStyle.getImagePreviewBorderRadius();
        if (imagePreviewBorderRadius != null) {
            binding.cardView.setRadius((float) ExtensionsKt.getDpToPx(imagePreviewBorderRadius.doubleValue()));
        }
        Double imagePreviewBorderWidth = this.styles.getImagePreviewBorderWidth();
        if (imagePreviewBorderWidth != null) {
            binding.cardView.setStrokeWidth((int) Math.ceil(ExtensionsKt.getDpToPx(imagePreviewBorderWidth.doubleValue())));
        }
        Integer imagePreviewBorderColor = this.styles.getImagePreviewBorderColor();
        if (imagePreviewBorderColor != null) {
            binding.cardView.setStrokeColor(imagePreviewBorderColor.intValue());
        }
        Integer imagePreviewMainAreaFillColor = this.styles.getImagePreviewMainAreaFillColor();
        if (imagePreviewMainAreaFillColor != null) {
            binding.addButton.setBackgroundColor(imagePreviewMainAreaFillColor.intValue());
        }
        ThemeableLottieAnimationView addButton = binding.addButton;
        Intrinsics.checkNotNullExpressionValue(addButton, "addButton");
        ImageStyling.replaceColors(addButton, this.styles.getImagePreviewPlusIconStrokeColor(), this.styles.getImagePreviewPlusIconFillColor(), null, new String[]{"#FFFFFF"}, new String[]{"#5B3FD3"}, new String[0]);
    }

    /* compiled from: DocumentTileAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item;", "", "<init>", "()V", "DocumentItem", "AddButtonItem", "Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item$AddButtonItem;", "Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item$DocumentItem;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Item {
        public /* synthetic */ Item(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DocumentTileAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item$DocumentItem;", "Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item;", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "getDocument", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "document", "Local", "Remote", "Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item$DocumentItem$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item$DocumentItem$Remote;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static abstract class DocumentItem extends Item {
            public /* synthetic */ DocumentItem(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract DocumentFile getDocument();

            private DocumentItem() {
                super(null);
            }

            /* compiled from: DocumentTileAdapter.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item$DocumentItem$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item$DocumentItem;", "Ljava/io/File;", "file", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "document", "", "mimeType", "<init>", "(Ljava/io/File;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "getDocument", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Ljava/lang/String;", "getMimeType", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final /* data */ class Local extends DocumentItem {
                private final DocumentFile.Local document;
                private final File file;
                private final String mimeType;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Local)) {
                        return false;
                    }
                    Local local = (Local) other;
                    return Intrinsics.areEqual(this.file, local.file) && Intrinsics.areEqual(this.document, local.document) && Intrinsics.areEqual(this.mimeType, local.mimeType);
                }

                public int hashCode() {
                    int iHashCode = ((this.file.hashCode() * 31) + this.document.hashCode()) * 31;
                    String str = this.mimeType;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "Local(file=" + this.file + ", document=" + this.document + ", mimeType=" + this.mimeType + ")";
                }

                public final File getFile() {
                    return this.file;
                }

                @Override // com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem
                public DocumentFile.Local getDocument() {
                    return this.document;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Local(File file, DocumentFile.Local document, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(document, "document");
                    this.file = file;
                    this.document = document;
                    this.mimeType = str;
                }
            }

            /* compiled from: DocumentTileAdapter.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item$DocumentItem$Remote;", "Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item$DocumentItem;", "", "remoteUrl", "filename", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRemoteUrl", "getFilename", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "getDocument", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "getMimeType", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final /* data */ class Remote extends DocumentItem {
                private final DocumentFile.Remote document;
                private final String filename;
                private final String mimeType;
                private final String remoteUrl;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Remote)) {
                        return false;
                    }
                    Remote remote = (Remote) other;
                    return Intrinsics.areEqual(this.remoteUrl, remote.remoteUrl) && Intrinsics.areEqual(this.filename, remote.filename) && Intrinsics.areEqual(this.document, remote.document) && Intrinsics.areEqual(this.mimeType, remote.mimeType);
                }

                public int hashCode() {
                    int iHashCode = this.remoteUrl.hashCode() * 31;
                    String str = this.filename;
                    int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.document.hashCode()) * 31;
                    String str2 = this.mimeType;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "Remote(remoteUrl=" + this.remoteUrl + ", filename=" + this.filename + ", document=" + this.document + ", mimeType=" + this.mimeType + ")";
                }

                public final String getRemoteUrl() {
                    return this.remoteUrl;
                }

                public final String getFilename() {
                    return this.filename;
                }

                @Override // com.withpersona.sdk2.inquiry.document.DocumentTileAdapter.Item.DocumentItem
                public DocumentFile.Remote getDocument() {
                    return this.document;
                }

                public String getMimeType() {
                    return this.mimeType;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Remote(String remoteUrl, String str, DocumentFile.Remote document, String str2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
                    Intrinsics.checkNotNullParameter(document, "document");
                    this.remoteUrl = remoteUrl;
                    this.filename = str;
                    this.document = document;
                    this.mimeType = str2;
                }
            }
        }

        private Item() {
        }

        /* compiled from: DocumentTileAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item$AddButtonItem;", "Lcom/withpersona/sdk2/inquiry/document/DocumentTileAdapter$Item;", "<init>", "()V", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class AddButtonItem extends Item {
            public AddButtonItem() {
                super(null);
            }
        }
    }
}
