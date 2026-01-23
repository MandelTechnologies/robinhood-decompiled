package com.truelayer.payments.p419ui.screens.formflows.components;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.components.SearchOptions;
import com.truelayer.payments.p419ui.components.SearchableItems4;
import com.truelayer.payments.p419ui.components.inputs.SelectOptionItem4;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import com.truelayer.payments.p419ui.models.QueryState;
import com.truelayer.payments.p419ui.screens.formflows.model.SelectOption;
import com.truelayer.payments.p419ui.utils.StringExtensions;
import com.truelayer.payments.p419ui.utils.TestTags;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SelectView.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\u001aW\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\n\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"", "title", "Lcom/truelayer/payments/ui/models/QueryState;", "query", "Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;", Fields4.TYPE, "Lkotlin/Function0;", "", Footer.f10637type, "Lkotlin/Function1;", "", "onSelect", "SelectView", "(Ljava/lang/String;Lcom/truelayer/payments/ui/models/QueryState;Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.formflows.components.SelectViewKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SelectView {
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectView(final String title, final QueryState query, final Fields4 select, final Function2<? super Composer, ? super Integer, Unit> function2, final Function1<? super Map<String, String>, Unit> onSelect, Composer composer, final int i) {
        Object next;
        Object obj;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(select, "select");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Composer composerStartRestartGroup = composer.startRestartGroup(-466090080);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-466090080, i, -1, "com.truelayer.payments.ui.screens.formflows.components.SelectView (SelectView.kt:21)");
        }
        composerStartRestartGroup.startReplaceableGroup(630565771);
        boolean zChanged = composerStartRestartGroup.changed(select) | ((((i & 112) ^ 48) > 32 && composerStartRestartGroup.changed(query)) || (i & 48) == 32);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (!zChanged) {
            obj = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                List<SelectOption> options = select.getOptions();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : options) {
                    SelectOption selectOption = (SelectOption) obj2;
                    String strSearchNormalizeLowercase = StringExtensions.searchNormalizeLowercase(query.getInner());
                    if (!StringsKt.contains((CharSequence) selectOption.getNormalizedLabel(), (CharSequence) strSearchNormalizeLowercase, true)) {
                        Iterator<T> it = selectOption.getNormalizedSearchAliases().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (StringsKt.contains((CharSequence) next, (CharSequence) strSearchNormalizeLowercase, true)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        if (next != null) {
                        }
                    }
                    arrayList.add(obj2);
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
        }
        List list = (List) obj;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(630566140);
        boolean zChanged2 = composerStartRestartGroup.changed(list);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(StringsKt.firstOrNull(((SelectOption) it2.next()).getLabel()));
            }
            objRememberedValue2 = CollectionsKt.toMutableList((Collection) arrayList2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i2 = i << 3;
        SearchableItems4.SearchableItems(TestTag3.testTag(Modifier.INSTANCE, TestTags.SELECT_OPTION_LIST), title, query, new SearchOptions(list, select.getRecentlyUsedOptions(), (List) objRememberedValue2), null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1303224801, true, new Function3<SelectOption, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.SelectViewKt.SelectView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SelectOption selectOption2, Composer composer2, Integer num) {
                invoke(selectOption2, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(SelectOption it3, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(it3, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1303224801, i3, -1, "com.truelayer.payments.ui.screens.formflows.components.SelectView.<anonymous> (SelectView.kt:47)");
                }
                final Function1<Map<String, String>, Unit> function1 = onSelect;
                final Fields4 fields4 = select;
                SelectOptionItem4.SelectOptionItem(null, it3, new Function1<SelectOption, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.SelectViewKt.SelectView.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SelectOption selectOption2) {
                        invoke2(selectOption2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SelectOption selectOption2) {
                        if (selectOption2 != null) {
                            function1.invoke(MapsKt.mapOf(Tuples4.m3642to(fields4.getId(), selectOption2.getId())));
                        }
                    }
                }, composer2, 64, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), function2, composerStartRestartGroup, (i2 & 896) | (i2 & 112) | 200710 | ((i << 9) & 3670016), 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.formflows.components.SelectViewKt.SelectView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    SelectView.SelectView(title, query, select, function2, onSelect, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
