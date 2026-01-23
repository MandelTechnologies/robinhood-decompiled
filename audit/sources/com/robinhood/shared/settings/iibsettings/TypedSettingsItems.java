package com.robinhood.shared.settings.iibsettings;

import android.content.res.Resources;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.settings.models.api.ApiHeaderIcon;
import com.robinhood.android.settings.models.api.ApiSettingsPage;
import com.robinhood.android.settings.models.api.ApiSettingsSection;
import com.robinhood.android.settings.models.api.ApiTypedSettingsItem;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.shared.settings.libsettings.C39787R;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypedSettingsItems.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0001\u001a(\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0002\u001a\u001e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014¨\u0006\u0015"}, m3636d2 = {"transform", "", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem;", "Lcom/robinhood/android/settings/models/api/ApiSettingsPage;", "onCustomItem", "Lkotlin/Function1;", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$CustomItem;", "processSettingsSection", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "section", "Lcom/robinhood/android/settings/models/api/ApiSettingsSection;", "processSettingsItem", "apiItem", "Lcom/robinhood/android/settings/models/api/ApiTypedSettingsItem;", "generateAppVersionItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "resources", "Landroid/content/res/Resources;", "versionName", "", "lib-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.settings.iibsettings.TypedSettingsItemsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TypedSettingsItems {
    public static final List<TypedSettingsItem> transform(ApiSettingsPage apiSettingsPage, Function1<? super TypedSettingsItem.CustomItem, ? extends TypedSettingsItem> onCustomItem) {
        Intrinsics.checkNotNullParameter(apiSettingsPage, "<this>");
        Intrinsics.checkNotNullParameter(onCustomItem, "onCustomItem");
        if (apiSettingsPage.getSections().isEmpty()) {
            throw new IllegalStateException("Account menu page has no settings items");
        }
        ArrayList arrayList = new ArrayList();
        Iterator itWithIndex = CollectionsKt.withIndex(apiSettingsPage.getSections().iterator());
        while (itWithIndex.hasNext()) {
            IndexedValue indexedValue = (IndexedValue) itWithIndex.next();
            arrayList.addAll(processSettingsSection(indexedValue.getIndex(), (ApiSettingsSection) indexedValue.component2(), onCustomItem));
        }
        return arrayList;
    }

    public static final List<TypedSettingsItem> processSettingsSection(int i, ApiSettingsSection section, Function1<? super TypedSettingsItem.CustomItem, ? extends TypedSettingsItem> onCustomItem) {
        ApiGenericAction action;
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(onCustomItem, "onCustomItem");
        ArrayList arrayList = new ArrayList();
        Iterator<ApiTypedSettingsItem> it = section.getItems().iterator();
        while (it.hasNext()) {
            TypedSettingsItem typedSettingsItemProcessSettingsItem = processSettingsItem(it.next(), onCustomItem);
            if (typedSettingsItemProcessSettingsItem != null) {
                arrayList.add(typedSettingsItemProcessSettingsItem);
            }
        }
        if (arrayList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        String header = section.getHeader();
        if (header != null) {
            String subtitle = section.getSubtitle();
            TextStyle header_style = section.getHeader_style();
            if (header_style == null) {
                header_style = TextStyle.TEXT_MEDIUM_BOLD;
            }
            TextStyle textStyle = header_style;
            boolean z = i == 0;
            ApiHeaderIcon icon_data = section.getIcon_data();
            GenericAction dbModel = null;
            ServerToBentoAssetMapper2 iconAsset = icon_data != null ? icon_data.getIconAsset() : null;
            ApiHeaderIcon icon_data2 = section.getIcon_data();
            if (icon_data2 != null && (action = icon_data2.getAction()) != null) {
                dbModel = action.toDbModel();
            }
            arrayList2.add(new TypedSettingsItem.SectionHeaderItem(header, header, subtitle, textStyle, z, iconAsset, dbModel));
        }
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    private static final TypedSettingsItem processSettingsItem(ApiTypedSettingsItem apiTypedSettingsItem, Function1<? super TypedSettingsItem.CustomItem, ? extends TypedSettingsItem> function1) {
        TypedSettingsItem uiModel = apiTypedSettingsItem.toUiModel();
        if (uiModel == null || BaseSettingsFragment.INSTANCE.getBLACKLISTED_SETTINGS_IDS().contains(uiModel.getId())) {
            return null;
        }
        if (!(uiModel instanceof TypedSettingsItem.CustomItem)) {
            return uiModel;
        }
        TypedSettingsItem typedSettingsItemInvoke = function1.invoke(uiModel);
        if (typedSettingsItemInvoke != null) {
            return typedSettingsItemInvoke;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new TypedSettingsItems2("Unknown bonfire settings custom item with ID: " + ((TypedSettingsItem.CustomItem) uiModel).getId()), false, null, 4, null);
        return null;
    }

    public static final TypedSettingsItem generateAppVersionItem(TypedSettingsItem.CustomItem item, Resources resources, String versionName) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        String string2 = resources.getString(C39787R.string.setting_version_summary, versionName);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new TypedSettingsItem.MarkdownItem(item.getId(), null, null, new MarkdownContent(string2), null);
    }
}
