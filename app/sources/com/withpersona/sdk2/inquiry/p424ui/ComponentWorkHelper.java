package com.withpersona.sdk2.inquiry.p424ui;

import android.graphics.Bitmap;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.TypedWorker;
import com.squareup.workflow1.Worker;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowAction4;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.p424ui.UiState;
import com.withpersona.sdk2.inquiry.p424ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.p424ui.network.UiAddressAutocompleteWorker;
import com.withpersona.sdk2.inquiry.p424ui.network.UiAddressDetailsWorker;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.BitmapValueComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.DateValueComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.MultiTextValueComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleBooleanValueComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleNumberValueComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleTextValueComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.StringSetValueComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent3;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.GovernmentIdNfcData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ComponentWorkHelper.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007JF\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2&\u0010\u000e\u001a\"0\u000fR\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0010j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u0015J8\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/ComponentWorkHelper;", "", "addressAutocompleteWorker", "Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Factory;", "addressDetailsWorker", "Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressDetailsWorker$Factory;", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressAutocompleteWorker$Factory;Lcom/withpersona/sdk2/inquiry/ui/network/UiAddressDetailsWorker$Factory;)V", "runComponentWorkers", "", "renderProps", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "renderState", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Output;", "Lcom/withpersona/sdk2/inquiry/ui/RenderContext;", "component", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "getComponentErrors", "", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "isFieldBlank", "", "componentErrors", "componentName", "", "subComponentName", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class ComponentWorkHelper {
    private final UiAddressAutocompleteWorker.Factory addressAutocompleteWorker;
    private final UiAddressDetailsWorker.Factory addressDetailsWorker;

    public ComponentWorkHelper(UiAddressAutocompleteWorker.Factory addressAutocompleteWorker, UiAddressDetailsWorker.Factory addressDetailsWorker) {
        Intrinsics.checkNotNullParameter(addressAutocompleteWorker, "addressAutocompleteWorker");
        Intrinsics.checkNotNullParameter(addressDetailsWorker, "addressDetailsWorker");
        this.addressAutocompleteWorker = addressAutocompleteWorker;
        this.addressDetailsWorker = addressDetailsWorker;
    }

    public final void runComponentWorkers(UiWorkflow.Input renderProps, final UiState.Displaying renderState, StatefulWorkflow<? super UiWorkflow.Input, UiState, ? extends UiWorkflow.Output, ? extends Object>.RenderContext context, final UiComponent component) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(component, "component");
        if (component instanceof SingleTextValueComponent) {
            TypedWorker typedWorker = new TypedWorker(Reflection.typeOf(String.class), ((SingleTextValueComponent) component).getTextController().getOnTextChanged());
            String name = component.getName();
            Function1 function1 = new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$1(renderState, component, this, (String) obj);
                }
            };
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            Workflows.runningWorker(context, typedWorker, Reflection.typeOf(Worker.class, companion.invariant(Reflection.typeOf(String.class))), name, function1);
            if (component instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(List.class, companion.invariant(Reflection.typeOf(Option.class))), inputPhoneNumberComponent.getCountryCodeOptionsController().getOnChanged()), Reflection.typeOf(Worker.class, companion.invariant(Reflection.typeOf(List.class, companion.invariant(Reflection.typeOf(Option.class))))), inputPhoneNumberComponent.getName() + ":country", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComponentWorkHelper.runComponentWorkers$lambda$3(renderState, component, this, (List) obj);
                    }
                });
                return;
            }
            return;
        }
        if (component instanceof MultiTextValueComponent) {
            Flow<List<Option>> onChanged = ((MultiTextValueComponent) component).getSelectedOptionsController().getOnChanged();
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(List.class, companion2.invariant(Reflection.typeOf(Option.class))), onChanged), Reflection.typeOf(Worker.class, companion2.invariant(Reflection.typeOf(List.class, companion2.invariant(Reflection.typeOf(Option.class))))), component.getName(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$5(renderState, component, this, (List) obj);
                }
            });
            return;
        }
        if (component instanceof StringSetValueComponent) {
            Flow<Set<String>> onChanged2 = ((StringSetValueComponent) component).getStringSetController().getOnChanged();
            KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
            Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(Set.class, companion3.invariant(Reflection.typeOf(String.class))), onChanged2), Reflection.typeOf(Worker.class, companion3.invariant(Reflection.typeOf(Set.class, companion3.invariant(Reflection.typeOf(String.class))))), component.getName(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$7(renderState, component, this, (Set) obj);
                }
            });
            return;
        }
        boolean z = component instanceof AddressValueComponent;
        Class cls = Boolean.TYPE;
        if (z) {
            TypedWorker typedWorker2 = new TypedWorker(Reflection.typeOf(cls), ((AddressValueComponent) component).getIsAddressFieldCollapsed().getOnChanged());
            String str = component.getName() + "UpdateCollapsedState";
            Function1 function12 = new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$9(renderState, component, ((Boolean) obj).booleanValue());
                }
            };
            KTypeProjection.Companion companion4 = KTypeProjection.INSTANCE;
            Workflows.runningWorker(context, typedWorker2, Reflection.typeOf(Worker.class, companion4.invariant(Reflection.typeOf(cls))), str, function12);
            AddressValueComponent addressValueComponent = (AddressValueComponent) component;
            Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(String.class), addressValueComponent.getTextControllerForAddressStreet1().getOnTextChanged()), Reflection.typeOf(Worker.class, companion4.invariant(Reflection.typeOf(String.class))), component.getName() + "UpdateAddressStreet1", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$11(renderState, component, this, (String) obj);
                }
            });
            Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(String.class), addressValueComponent.getTextControllerForAddressStreet2().getOnTextChanged()), Reflection.typeOf(Worker.class, companion4.invariant(Reflection.typeOf(String.class))), component.getName() + "UpdateAddressStreet2", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$13(renderState, component, this, (String) obj);
                }
            });
            Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(String.class), addressValueComponent.getTextControllerForAddressCity().getOnTextChanged()), Reflection.typeOf(Worker.class, companion4.invariant(Reflection.typeOf(String.class))), component.getName() + "UpdateAddressCity", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$15(renderState, component, this, (String) obj);
                }
            });
            Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(String.class), addressValueComponent.getTextControllerForAddressSubdivision().getOnTextChanged()), Reflection.typeOf(Worker.class, companion4.invariant(Reflection.typeOf(String.class))), component.getName() + "UpdateAddressSubdivision", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$17(renderState, component, this, (String) obj);
                }
            });
            Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(String.class), addressValueComponent.getTextControllerForAddressPostalCode().getOnTextChanged()), Reflection.typeOf(Worker.class, companion4.invariant(Reflection.typeOf(String.class))), component.getName() + "UpdateAddressPostalCode", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$19(renderState, component, this, (String) obj);
                }
            });
            if (component instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                String searchQuery = inputAddressComponent.getSearchQuery();
                if (searchQuery != null) {
                    Workflows.runningWorker(context, this.addressAutocompleteWorker.create(renderProps.getSessionToken(), component, searchQuery), Reflection.typeOf(UiAddressAutocompleteWorker.class), inputAddressComponent.getName(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ComponentWorkHelper.runComponentWorkers$lambda$22$lambda$21(renderState, component, (UiAddressAutocompleteWorker.Response) obj);
                        }
                    });
                }
                String selectedSearchResultId = inputAddressComponent.getSelectedSearchResultId();
                if (selectedSearchResultId != null) {
                    Workflows.runningWorker(context, this.addressDetailsWorker.create(renderProps.getSessionToken(), selectedSearchResultId), Reflection.typeOf(UiAddressDetailsWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ComponentWorkHelper.runComponentWorkers$lambda$26$lambda$25(renderState, component, (UiAddressDetailsWorker.Response) obj);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (component instanceof SingleBooleanValueComponent) {
            Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(cls), ((SingleBooleanValueComponent) component).getTwoStateViewController().getOnChanged()), Reflection.typeOf(Worker.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(cls))), component.getName(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$28(renderState, component, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (component instanceof SingleNumberValueComponent) {
            Workflows.runningWorker(context, new TypedWorker(Reflection.nullableTypeOf(Number.class), ((SingleNumberValueComponent) component).getNumberController().getOnChanged()), Reflection.typeOf(Worker.class, KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Number.class))), component.getName(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$30(renderState, component, this, (Number) obj);
                }
            });
            return;
        }
        if (component instanceof BitmapValueComponent) {
            Workflows.runningWorker(context, new TypedWorker(Reflection.nullableTypeOf(Bitmap.class), ((BitmapValueComponent) component).getBitmapController().getOnChanged()), Reflection.typeOf(Worker.class, KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(Bitmap.class))), component.getName(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$32(renderState, component, (Bitmap) obj);
                }
            });
            return;
        }
        if (component instanceof DateValueComponent) {
            Workflows.runningWorker(context, new TypedWorker(Reflection.nullableTypeOf(String.class), ((DateValueComponent) component).getDateController().getOnChanged()), Reflection.typeOf(Worker.class, KTypeProjection.INSTANCE.invariant(Reflection.nullableTypeOf(String.class))), component.getName(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$34(renderState, component, this, (String) obj);
                }
            });
            return;
        }
        if (!(component instanceof GovernmentIdNfcScanComponent)) {
            if (component instanceof InputInternationalDbComponent) {
                InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
                Flow<List<Option>> onChanged3 = inputInternationalDbComponent.getCountryOptionsController().getOnChanged();
                KTypeProjection.Companion companion5 = KTypeProjection.INSTANCE;
                Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(List.class, companion5.invariant(Reflection.typeOf(Option.class))), onChanged3), Reflection.typeOf(Worker.class, companion5.invariant(Reflection.typeOf(List.class, companion5.invariant(Reflection.typeOf(Option.class))))), inputInternationalDbComponent.getName() + ":country", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComponentWorkHelper.runComponentWorkers$lambda$46(renderState, component, this, (List) obj);
                    }
                });
                Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(List.class, companion5.invariant(Reflection.typeOf(Option.class))), inputInternationalDbComponent.getIdTypeOptionsController().getOnChanged()), Reflection.typeOf(Worker.class, companion5.invariant(Reflection.typeOf(List.class, companion5.invariant(Reflection.typeOf(Option.class))))), inputInternationalDbComponent.getName() + ":idType", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComponentWorkHelper.runComponentWorkers$lambda$48(renderState, component, this, (List) obj);
                    }
                });
                Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(String.class), inputInternationalDbComponent.getIdValueController().getOnTextChanged()), Reflection.typeOf(Worker.class, companion5.invariant(Reflection.typeOf(String.class))), inputInternationalDbComponent.getName() + ":idValue", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComponentWorkHelper.runComponentWorkers$lambda$50(renderState, component, this, (String) obj);
                    }
                });
                return;
            }
            return;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
        TypedWorker typedWorker3 = new TypedWorker(Reflection.typeOf(String.class), governmentIdNfcScanComponent.getCardAccessNumberController().getOnTextChanged());
        String str2 = governmentIdNfcScanComponent.getName() + "UpdateCardAccessNumber";
        Function1 function13 = new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$36(renderState, component, this, (String) obj);
            }
        };
        KTypeProjection.Companion companion6 = KTypeProjection.INSTANCE;
        Workflows.runningWorker(context, typedWorker3, Reflection.typeOf(Worker.class, companion6.invariant(Reflection.typeOf(String.class))), str2, function13);
        Workflows.runningWorker(context, new TypedWorker(Reflection.typeOf(String.class), governmentIdNfcScanComponent.getDocumentNumberController().getOnTextChanged()), Reflection.typeOf(Worker.class, companion6.invariant(Reflection.typeOf(String.class))), governmentIdNfcScanComponent.getName() + "UpdateDocumentNumber", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$38(renderState, component, this, (String) obj);
            }
        });
        Workflows.runningWorker(context, new TypedWorker(Reflection.nullableTypeOf(String.class), governmentIdNfcScanComponent.getDateOfBirthController().getOnChanged()), Reflection.typeOf(Worker.class, companion6.invariant(Reflection.nullableTypeOf(String.class))), governmentIdNfcScanComponent.getName() + "UpdateDateOfBirth", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$40(renderState, component, this, (String) obj);
            }
        });
        Workflows.runningWorker(context, new TypedWorker(Reflection.nullableTypeOf(String.class), governmentIdNfcScanComponent.getExpirationDateController().getOnChanged()), Reflection.typeOf(Worker.class, companion6.invariant(Reflection.nullableTypeOf(String.class))), governmentIdNfcScanComponent.getName() + "UpdateExpirationDate", new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$42(renderState, component, this, (String) obj);
            }
        });
        Workflows.runningWorker(context, new TypedWorker(Reflection.nullableTypeOf(GovernmentIdNfcData.class), governmentIdNfcScanComponent.getNfcDataController().getOnChanged()), Reflection.typeOf(Worker.class, companion6.invariant(Reflection.nullableTypeOf(GovernmentIdNfcData.class))), governmentIdNfcScanComponent.getName(), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$44(renderState, component, (GovernmentIdNfcData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$1(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$1$lambda$0(displaying, uiComponent, newText, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$1$lambda$0(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((SingleTextValueComponent) uiComponent).update(str)), null, getComponentErrors$default(componentWorkHelper, str.length() == 0, displaying.getComponentErrors(), uiComponent.getName(), null, 8, null), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$3(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$3$lambda$2(displaying, uiComponent, newText, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$3$lambda$2(UiState.Displaying displaying, UiComponent uiComponent, List list, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) uiComponent;
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, inputPhoneNumberComponent.updateSelectedCountry((Option) CollectionsKt.firstOrNull(list))), null, getComponentErrors$default(componentWorkHelper, list.isEmpty(), displaying.getComponentErrors(), inputPhoneNumberComponent.getName(), null, 8, null), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$5(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final List selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$5$lambda$4(displaying, uiComponent, selectedOptions, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$5$lambda$4(UiState.Displaying displaying, UiComponent uiComponent, List list, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((MultiTextValueComponent) uiComponent).update(list)), null, getComponentErrors$default(componentWorkHelper, list.isEmpty(), displaying.getComponentErrors(), uiComponent.getName(), null, 8, null), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$7(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final Set stringSet) {
        Intrinsics.checkNotNullParameter(stringSet, "stringSet");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$7$lambda$6(displaying, uiComponent, stringSet, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$7$lambda$6(UiState.Displaying displaying, UiComponent uiComponent, Set set, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((StringSetValueComponent) uiComponent).update(set)), null, getComponentErrors$default(componentWorkHelper, set.isEmpty(), displaying.getComponentErrors(), uiComponent.getName(), null, 8, null), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$9(final UiState.Displaying displaying, final UiComponent uiComponent, final boolean z) {
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$9$lambda$8(displaying, uiComponent, z, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$9$lambda$8(UiState.Displaying displaying, UiComponent uiComponent, boolean z, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((AddressValueComponent) uiComponent).updateCollapsedState(Boolean.valueOf(z))), null, null, null, null, null, null, null, false, false, null, null, null, 8190, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$11(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$11$lambda$10(displaying, uiComponent, newText, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$11$lambda$10(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((AddressValueComponent) uiComponent).updateAddressStreet1(str).updateSearchQuery(str)), null, componentWorkHelper.getComponentErrors(str.length() == 0, displaying.getComponentErrors(), uiComponent.getName(), "street_1"), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$13(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$13$lambda$12(displaying, uiComponent, newText, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$13$lambda$12(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((AddressValueComponent) uiComponent).updateAddressStreet2(str)), null, componentWorkHelper.getComponentErrors(str.length() == 0, displaying.getComponentErrors(), uiComponent.getName(), "street_2"), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$15(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$15$lambda$14(displaying, uiComponent, newText, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$15$lambda$14(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((AddressValueComponent) uiComponent).updateAddressCity(str)), null, componentWorkHelper.getComponentErrors(str.length() == 0, displaying.getComponentErrors(), uiComponent.getName(), "city"), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$17(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$17$lambda$16(displaying, uiComponent, newText, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$17$lambda$16(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((AddressValueComponent) uiComponent).updateAddressSubdivision(str)), null, componentWorkHelper.getComponentErrors(str.length() == 0, displaying.getComponentErrors(), uiComponent.getName(), "subdivision"), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$19(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$19$lambda$18(displaying, uiComponent, newText, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$19$lambda$18(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((AddressValueComponent) uiComponent).updateAddressPostalCode(str)), null, componentWorkHelper.getComponentErrors(str.length() == 0, displaying.getComponentErrors(), uiComponent.getName(), PlaceTypes.POSTAL_CODE), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$22$lambda$21(final UiState.Displaying displaying, final UiComponent uiComponent, final UiAddressAutocompleteWorker.Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$22$lambda$21$lambda$20(response, displaying, uiComponent, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$22$lambda$21$lambda$20(UiAddressAutocompleteWorker.Response response, UiState.Displaying displaying, UiComponent uiComponent, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (response instanceof UiAddressAutocompleteWorker.Response.Success) {
            action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((InputAddressComponent) uiComponent).updateSearchResults(((UiAddressAutocompleteWorker.Response.Success) response).getResults()).updateSearchQuery(null)), null, null, null, null, null, null, null, false, false, null, null, null, 8190, null));
        } else if (!(response instanceof UiAddressAutocompleteWorker.Response.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$26$lambda$25(final UiState.Displaying displaying, final UiComponent uiComponent, final UiAddressDetailsWorker.Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response instanceof UiAddressDetailsWorker.Response.Success) {
            return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$26$lambda$25$lambda$23(displaying, uiComponent, response, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (response instanceof UiAddressDetailsWorker.Response.Error) {
            return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentWorkHelper.runComponentWorkers$lambda$26$lambda$25$lambda$24(response, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$26$lambda$25$lambda$23(UiState.Displaying displaying, UiComponent uiComponent, UiAddressDetailsWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<UiComponent> components = displaying.getComponents();
        Boolean bool = Boolean.FALSE;
        UiAddressDetailsWorker.Response.Success success = (UiAddressDetailsWorker.Response.Success) response;
        InputAddressComponent inputAddressComponentUpdateAddressStreet1 = ((InputAddressComponent) uiComponent).updateCollapsedState(bool).updateAddressStreet1(success.getResult().getAddressStreet1());
        String addressStreet2 = success.getResult().getAddressStreet2();
        if (addressStreet2 == null) {
            addressStreet2 = "";
        }
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(components, uiComponent, inputAddressComponentUpdateAddressStreet1.updateAddressStreet2(addressStreet2).updateAddressCity(success.getResult().getAddressCity()).updateAddressSubdivision(success.getResult().getAddressSubdivision()).updateAddressPostalCode(success.getResult().getAddressPostalCode()).updateSelectedSearchResultId(null).updateIsAddressAutocompleteLoading(bool)), null, null, null, null, null, null, null, false, false, null, null, null, 8190, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$26$lambda$25$lambda$24(UiAddressDetailsWorker.Response response, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new UiWorkflow.Output.Error("Couldn't load address.", ((UiAddressDetailsWorker.Response.Error) response).getCause()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$28(final UiState.Displaying displaying, final UiComponent uiComponent, final boolean z) {
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$28$lambda$27(displaying, uiComponent, z, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$28$lambda$27(UiState.Displaying displaying, UiComponent uiComponent, boolean z, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((SingleBooleanValueComponent) uiComponent).update(z)), null, null, null, null, null, null, null, false, false, null, null, null, 8190, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$30(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final Number number) {
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$30$lambda$29(displaying, uiComponent, number, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$30$lambda$29(UiState.Displaying displaying, UiComponent uiComponent, Number number, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((SingleNumberValueComponent) uiComponent).update(number)), null, getComponentErrors$default(componentWorkHelper, number == null, displaying.getComponentErrors(), uiComponent.getName(), null, 8, null), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$32(final UiState.Displaying displaying, final UiComponent uiComponent, final Bitmap bitmap) {
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$32$lambda$31(displaying, uiComponent, bitmap, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$32$lambda$31(UiState.Displaying displaying, UiComponent uiComponent, Bitmap bitmap, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((BitmapValueComponent) uiComponent).update(bitmap)), null, null, null, null, null, null, null, false, false, null, null, null, 8190, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$34(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String str) {
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$34$lambda$33(displaying, uiComponent, str, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$34$lambda$33(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((DateValueComponent) uiComponent).update(str)), null, getComponentErrors$default(componentWorkHelper, str == null || str.length() == 0, displaying.getComponentErrors(), uiComponent.getName(), null, 8, null), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$36(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$36$lambda$35(displaying, uiComponent, newValue, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$36$lambda$35(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) uiComponent;
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, governmentIdNfcScanComponent.updateCardAccessNumber(str)), null, componentWorkHelper.getComponentErrors(str.length() == 0, displaying.getComponentErrors(), governmentIdNfcScanComponent.getName(), GovernmentIdNfcScan.cardAccessNumberName), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$38(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$38$lambda$37(displaying, uiComponent, newValue, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$38$lambda$37(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) uiComponent;
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, governmentIdNfcScanComponent.updateDocumentNumber(str)), null, componentWorkHelper.getComponentErrors(str.length() == 0, displaying.getComponentErrors(), governmentIdNfcScanComponent.getName(), GovernmentIdNfcScan.documentNumberName), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$40(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String str) {
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$40$lambda$39(displaying, uiComponent, str, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$40$lambda$39(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) uiComponent;
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, governmentIdNfcScanComponent.updateDateOfBirth(str)), null, componentWorkHelper.getComponentErrors(str == null || str.length() == 0, displaying.getComponentErrors(), governmentIdNfcScanComponent.getName(), GovernmentIdNfcScan.dateOfBirthName), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$42(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String str) {
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$42$lambda$41(displaying, uiComponent, str, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$42$lambda$41(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) uiComponent;
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, governmentIdNfcScanComponent.updateExpirationDate(str)), null, componentWorkHelper.getComponentErrors(str == null || str.length() == 0, displaying.getComponentErrors(), governmentIdNfcScanComponent.getName(), GovernmentIdNfcScan.expirationDateName), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$44(final UiState.Displaying displaying, final UiComponent uiComponent, final GovernmentIdNfcData governmentIdNfcData) {
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$44$lambda$43(displaying, uiComponent, governmentIdNfcData, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$44$lambda$43(UiState.Displaying displaying, UiComponent uiComponent, GovernmentIdNfcData governmentIdNfcData, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).updateNfcData(governmentIdNfcData)), null, null, null, null, null, null, null, false, false, null, null, null, 8190, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$46(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$46$lambda$45(displaying, uiComponent, newText, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$46$lambda$45(UiState.Displaying displaying, UiComponent uiComponent, List list, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, inputInternationalDbComponent.updateSelectedCountry((Option) CollectionsKt.firstOrNull(list))), null, getComponentErrors$default(componentWorkHelper, list.isEmpty(), displaying.getComponentErrors(), inputInternationalDbComponent.getName(), null, 8, null), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$48(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$48$lambda$47(displaying, uiComponent, newText, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$48$lambda$47(UiState.Displaying displaying, UiComponent uiComponent, List list, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, inputInternationalDbComponent.updateSelectedIdType((Option) CollectionsKt.firstOrNull(list))), null, getComponentErrors$default(componentWorkHelper, list.isEmpty(), displaying.getComponentErrors(), inputInternationalDbComponent.getName(), null, 8, null), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runComponentWorkers$lambda$50(final UiState.Displaying displaying, final UiComponent uiComponent, final ComponentWorkHelper componentWorkHelper, final String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComponentWorkHelper.runComponentWorkers$lambda$50$lambda$49(displaying, uiComponent, newText, componentWorkHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runComponentWorkers$lambda$50$lambda$49(UiState.Displaying displaying, UiComponent uiComponent, String str, ComponentWorkHelper componentWorkHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
        action.setState(UiState.Displaying.copy$default(displaying, UiComponent3.updateComponent(displaying.getComponents(), uiComponent, inputInternationalDbComponent.updateValue(str)), null, getComponentErrors$default(componentWorkHelper, str.length() == 0, displaying.getComponentErrors(), inputInternationalDbComponent.getName(), null, 8, null), null, null, null, null, null, false, false, null, null, null, 8186, null));
        return Unit.INSTANCE;
    }

    static /* synthetic */ List getComponentErrors$default(ComponentWorkHelper componentWorkHelper, boolean z, List list, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return componentWorkHelper.getComponentErrors(z, list, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<UiComponentError> getComponentErrors(boolean isFieldBlank, List<? extends UiComponentError> componentErrors, String componentName, String subComponentName) {
        Object next;
        List<? extends UiComponentError> list = componentErrors;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((UiComponentError) next).getName(), componentName)) {
                break;
            }
        }
        UiComponentError uiComponentError = (UiComponentError) next;
        if (isFieldBlank) {
            return componentErrors;
        }
        if (uiComponentError instanceof UiComponentError.UiGovernmentIdNfcScanComponentError) {
            UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentError;
            Map<String, String> message = uiGovernmentIdNfcScanComponentError.getMessage();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : message.entrySet()) {
                if (!Intrinsics.areEqual(entry.getKey(), subComponentName)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            uiGovernmentIdNfcScanComponentError.setMessage(linkedHashMap);
            return componentErrors;
        }
        if (uiComponentError instanceof UiComponentError.UiInputAddressComponentError) {
            UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = (UiComponentError.UiInputAddressComponentError) uiComponentError;
            Map<String, String> message2 = uiInputAddressComponentError.getMessage();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, String> entry2 : message2.entrySet()) {
                if (!Intrinsics.areEqual(entry2.getKey(), subComponentName)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            uiInputAddressComponentError.setMessage(linkedHashMap2);
            return componentErrors;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((UiComponentError) obj).getName(), componentName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
