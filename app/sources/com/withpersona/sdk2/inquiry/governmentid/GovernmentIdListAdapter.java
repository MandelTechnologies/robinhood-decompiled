package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidIdlistBinding;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.resources.R$attr;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder2;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.RemoteImageUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GovernmentIdListAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J*\u0010*\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b)0(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001bH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u00101R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u00107R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R0\u0010>\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170<j\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0017`=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR*\u0010D\u001a\u00020@2\u0006\u0010C\u001a\u00020@8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010B\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006H"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", "context", "", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", WebsocketGatewayConstants.DATA_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "assetConfig", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "", "onClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;Lkotlin/jvm/functions/Function1;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidIdlistBinding;", "viewHolder", "applyStyles", "(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidIdlistBinding;)V", "binding", "Landroid/graphics/drawable/Drawable;", "drawableRes", "setupIcon", "(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidIdlistBinding;Landroid/graphics/drawable/Drawable;)V", "", "strokeColor", "fillColor", "iconDrawable", "makeDrawable", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "pressedColor", "Landroid/content/res/ColorStateList;", "getPressedColorSelector", "(I)Landroid/content/res/ColorStateList;", "Landroid/view/ViewGroup;", "parent", "viewType", "Lcom/withpersona/sdk2/inquiry/shared/ViewBindingViewHolder;", "Lkotlin/jvm/internal/EnhancedNullability;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/withpersona/sdk2/inquiry/shared/ViewBindingViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Ljava/util/List;", "getData", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "cachedImages", "Ljava/util/HashMap;", "", "useIcons", "Z", "value", "isEnabled", "()Z", "setEnabled", "(Z)V", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class GovernmentIdListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;
    private final HashMap<Integer, Drawable> cachedImages;
    private final List<EnabledIdClass> data;
    private boolean isEnabled;
    private final Function1<IdConfig, Unit> onClick;
    private final StepStyles.GovernmentIdStepStyle styles;
    private final boolean useIcons;

    /* compiled from: GovernmentIdListAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdIcon.values().length];
            try {
                iArr[IdIcon.World.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdIcon.Card.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdIcon.Flag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdIcon.House.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GovernmentIdListAdapter(Context context, List<EnabledIdClass> data, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.SelectPage selectPage, Function1<? super IdConfig, Unit> onClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.data = data;
        this.styles = governmentIdStepStyle;
        this.assetConfig = selectPage;
        this.onClick = onClick;
        this.cachedImages = new HashMap<>();
        this.useIcons = !ResTools.boolFromAttr$default(context, R$attr.personaGovIdSelectHideIcon, null, false, false, 14, null);
        this.isEnabled = true;
    }

    public final void setEnabled(boolean z) {
        if (this.isEnabled == z) {
            return;
        }
        this.isEnabled = z;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewBindingViewHolder<Pi2GovernmentidIdlistBinding> onCreateViewHolder(ViewGroup parent, int viewType) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Pi2GovernmentidIdlistBinding pi2GovernmentidIdlistBindingInflate = Pi2GovernmentidIdlistBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(pi2GovernmentidIdlistBindingInflate, "inflate(...)");
        ViewBindingViewHolder<Pi2GovernmentidIdlistBinding> viewBindingViewHolder = new ViewBindingViewHolder<>(pi2GovernmentidIdlistBindingInflate);
        ViewBinding binding = viewBindingViewHolder.getBinding();
        Intrinsics.checkNotNullExpressionValue(binding, "<get-binding>(...)");
        applyStyles((Pi2GovernmentidIdlistBinding) binding);
        return viewBindingViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.data.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RemoteImage iconPassport;
        int i;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final EnabledIdClass enabledIdClass = this.data.get(position);
        Pi2GovernmentidIdlistBinding pi2GovernmentidIdlistBinding = (Pi2GovernmentidIdlistBinding) ViewBindingViewHolder2.getBinding(holder);
        pi2GovernmentidIdlistBinding.label.setText(enabledIdClass.getName());
        IdIcon icon = enabledIdClass.getIcon();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[icon.ordinal()];
        if (i2 == 1) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = this.assetConfig;
            if (selectPage != null) {
                iconPassport = selectPage.getIconPassport();
            }
        } else if (i2 == 2) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage2 = this.assetConfig;
            if (selectPage2 != null) {
                iconPassport = selectPage2.getIconGovernmentId();
            }
        } else if (i2 == 3) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage3 = this.assetConfig;
            if (selectPage3 != null) {
                iconPassport = selectPage3.getIconDriversLicense();
            }
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage4 = this.assetConfig;
            if (selectPage4 == null || (iconPassport = selectPage4.getIconNationalId()) == null) {
                NextStep.GovernmentId.AssetConfig.SelectPage selectPage5 = this.assetConfig;
                iconPassport = selectPage5 != null ? selectPage5.getIconGovernmentId() : null;
            }
        }
        Object tag = pi2GovernmentidIdlistBinding.iconContainer.getTag(R$id.pi2_remote_image_view);
        View view = tag instanceof View ? (View) tag : null;
        if (view != null) {
            pi2GovernmentidIdlistBinding.iconContainer.removeView(view);
        }
        if (!this.useIcons) {
            pi2GovernmentidIdlistBinding.iconContainer.setVisibility(8);
            TextView label = pi2GovernmentidIdlistBinding.label;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            label.setPaddingRelative(0, label.getPaddingTop(), label.getPaddingEnd(), label.getPaddingBottom());
        } else if (iconPassport != null) {
            ConstraintLayout iconContainer = pi2GovernmentidIdlistBinding.iconContainer;
            Intrinsics.checkNotNullExpressionValue(iconContainer, "iconContainer");
            pi2GovernmentidIdlistBinding.iconContainer.setTag(R$id.pi2_remote_image_view, RemoteImageUtils.renderToContainer(iconPassport, iconContainer, true));
            pi2GovernmentidIdlistBinding.icon.setVisibility(8);
            TextView label2 = pi2GovernmentidIdlistBinding.label;
            Intrinsics.checkNotNullExpressionValue(label2, "label");
            label2.setPaddingRelative((int) ExtensionsKt.getDpToPx(8.0d), label2.getPaddingTop(), label2.getPaddingEnd(), label2.getPaddingBottom());
        } else {
            pi2GovernmentidIdlistBinding.icon.setVisibility(0);
            if (this.cachedImages.get(Integer.valueOf(position)) != null) {
                pi2GovernmentidIdlistBinding.icon.setImageDrawable(this.cachedImages.get(Integer.valueOf(position)));
            } else {
                int i3 = iArr[enabledIdClass.getIcon().ordinal()];
                if (i3 == 1) {
                    i = R$drawable.pi2_governmentid_world;
                } else if (i3 == 2) {
                    i = R$drawable.pi2_governmentid_card;
                } else if (i3 == 3) {
                    i = R$drawable.pi2_governmentid_flag;
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$drawable.pi2_governmentid_house;
                }
                Drawable drawable = AppCompatResources.getDrawable(pi2GovernmentidIdlistBinding.getRoot().getContext(), i);
                if (drawable != null) {
                    setupIcon(pi2GovernmentidIdlistBinding, drawable);
                    this.cachedImages.put(Integer.valueOf(position), pi2GovernmentidIdlistBinding.icon.getDrawable());
                }
            }
            TextView label3 = pi2GovernmentidIdlistBinding.label;
            Intrinsics.checkNotNullExpressionValue(label3, "label");
            label3.setPaddingRelative((int) ExtensionsKt.getDpToPx(8.0d), label3.getPaddingTop(), label3.getPaddingEnd(), label3.getPaddingBottom());
        }
        pi2GovernmentidIdlistBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdListAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GovernmentIdListAdapter.onBindViewHolder$lambda$3(this.f$0, enabledIdClass, view2);
            }
        });
        pi2GovernmentidIdlistBinding.getRoot().setEnabled(this.isEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(GovernmentIdListAdapter governmentIdListAdapter, EnabledIdClass enabledIdClass, View view) {
        governmentIdListAdapter.onClick.invoke(enabledIdClass.getIdConfig());
    }

    private final void applyStyles(Pi2GovernmentidIdlistBinding viewHolder) throws IllegalArgumentException {
        Double governmentIdSelectOptionMinRowHeight;
        Integer backgroundColorValue;
        Integer chevronColor;
        TextBasedComponentStyle governmentIdVerticalOptionTextStyle;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        if (governmentIdStepStyle != null && (governmentIdVerticalOptionTextStyle = governmentIdStepStyle.getGovernmentIdVerticalOptionTextStyle()) != null) {
            TextView label = viewHolder.label;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            TextStyling2.style$default(label, governmentIdVerticalOptionTextStyle, null, 2, null);
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = this.styles;
        if (governmentIdStepStyle2 != null && (chevronColor = governmentIdStepStyle2.getChevronColor()) != null) {
            viewHolder.chevron.setColorFilter(chevronColor.intValue());
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = this.styles;
        if (governmentIdStepStyle3 != null && (backgroundColorValue = governmentIdStepStyle3.getBackgroundColorValue()) != null) {
            int iIntValue = backgroundColorValue.intValue();
            Integer activeOptionBackgroundColorValue = this.styles.getActiveOptionBackgroundColorValue();
            if (activeOptionBackgroundColorValue != null) {
                viewHolder.getRoot().setBackground(new RippleDrawable(getPressedColorSelector(activeOptionBackgroundColorValue.intValue()), new ColorDrawable(iIntValue), null));
            }
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle4 = this.styles;
        if (governmentIdStepStyle4 == null || (governmentIdSelectOptionMinRowHeight = governmentIdStepStyle4.getGovernmentIdSelectOptionMinRowHeight()) == null) {
            return;
        }
        viewHolder.rootLayout.setMinHeight((int) ExtensionsKt.getDpToPx(governmentIdSelectOptionMinRowHeight.doubleValue()));
    }

    private final void setupIcon(Pi2GovernmentidIdlistBinding binding, Drawable drawableRes) {
        Integer governmentIdIconFillColor;
        Integer governmentIdIconStrokeColor;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        Integer numValueOf = null;
        Integer numValueOf2 = (governmentIdStepStyle == null || (governmentIdIconStrokeColor = governmentIdStepStyle.getGovernmentIdIconStrokeColor()) == null) ? null : Integer.valueOf(governmentIdIconStrokeColor.intValue());
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = this.styles;
        if (governmentIdStepStyle2 != null && (governmentIdIconFillColor = governmentIdStepStyle2.getGovernmentIdIconFillColor()) != null) {
            numValueOf = Integer.valueOf(governmentIdIconFillColor.intValue());
        }
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawableMutate = makeDrawable(context, numValueOf2, numValueOf, drawableRes).mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        binding.icon.setImageDrawable(drawableMutate);
    }

    private final Drawable makeDrawable(Context context, Integer strokeColor, Integer fillColor, Drawable iconDrawable) {
        Drawable drawableMutate;
        ArrayList arrayList = new ArrayList();
        if (strokeColor != null) {
            iconDrawable.mutate().setTint(strokeColor.intValue());
        }
        Drawable drawable = AppCompatResources.getDrawable(context, R$drawable.pi2_governmentid_circle_background);
        if (fillColor != null && drawable != null && (drawableMutate = drawable.mutate()) != null) {
            drawableMutate.setTint(fillColor.intValue());
        }
        if (drawable != null) {
            arrayList.add(drawable);
        }
        arrayList.add(iconDrawable);
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
    }

    private final ColorStateList getPressedColorSelector(int pressedColor) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{pressedColor});
    }
}
